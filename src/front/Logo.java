package front;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Logo extends JPanel {

	/**
	 * Create the panel.
	 */
	private Image imagen;
	
	
	
	public Logo() {

	}
	
	public void paint(Graphics g) {
		
		imagen = new ImageIcon(getClass().getResource("logo alforno.jpg")).getImage();
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		super.paint(g);
		
	}

}
