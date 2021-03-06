/**
 * @author Edgar Zaganjori, Daniyal Javed, Richmond Frimpong
 * 
 */

public class LaunchUrl {

	/**
	 * Launches the url in help
	 * 
	 * @param String
	 *            
	 */
	public static void launchURL(String s) {
		String s1 = System.getProperty("os.name");
		try {

			if (s1.startsWith("Windows")) {
				Runtime.getRuntime().exec(
						(new StringBuilder()).append("rundll32 url.dll,FileProtocolHandler ").append(s).toString());
			} else {
				String as[] = {"chrome", "google", "safari", "apple", "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape" };
				String s2 = null;
				for (int i = 0; i < as.length && s2 == null; i++) {
					if (Runtime.getRuntime().exec(new String[] { "which", as[i] }).waitFor() == 0) {
						s2 = as[i];
					}
				}
				if (s2 == null) {
					throw new Exception("Could not find web browser");
				}
				Runtime.getRuntime().exec(new String[] { s2, s });
			}
		} catch (Exception exception) {
			System.out.println("An error occured while trying to open the web browser!\n");
		}
	}
}