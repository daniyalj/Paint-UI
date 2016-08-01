
/**
 * @author Edgar Zaganjori, Daniyal Javed, Richmond Frimpong
 * @course EECS3461 
 * @title a2
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.UIManager.*;

/**
 * 
 * Main Method
 *
 */

public class a2 {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaintAppFrame paintFrame = new PaintAppFrame();
					paintFrame.setTitle("Paint");
					Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
					paintFrame.setSize(screenSize);
					paintFrame.setMinimumSize(new Dimension(650, 650));
					paintFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
