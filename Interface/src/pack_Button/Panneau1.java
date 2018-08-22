package pack_Button;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau1 extends JPanel {

	private int posX = 0;
	private int posY = 0;


	public void paintComponent (Graphics g) {

		// Cette phrase sera visible a chaque fois que la m�thode sera invoqu�e
		System.out.println("Je suis ex�cut�e !");


		//On choisit une couleur de fond pour le rectangle
		g.setColor(Color.black);
		//On le dessine de sorte qu'il occupe toute la surface
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		//On red�finit une couleur pour le rond
		g.setColor(Color.blue);
		//On le dessine aux coordonn�es souhait�es
		g.fillOval(posX, posY, 50, 50);

	}

	public int getPosX () {
		return posX;
	}

	public void setPosX (int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY (int posY) {
		this.posY = posY;
	}


}
