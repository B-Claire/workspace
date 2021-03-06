package cdi.projet.ihm.component;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fenetre extends JFrame{

	private static final long serialVersionUID = 1L;//serialiser les donn� (les mettre en tableaux)
	private GamePanel gamePanel;
	private GameInformationPanel gameInformationPanel;
	private JPanel container = new JPanel();
	protected static String nom ;//pour mettre le nom
	
	public Fenetre(){
		this.setTitle("CDI swing Ihm");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		
		gamePanel = new GamePanel();
		container.add(gamePanel, BorderLayout.CENTER);
		
		gameInformationPanel = new GameInformationPanel(gamePanel);
		container.add(gameInformationPanel, BorderLayout.NORTH);//bloc top
		
		this.setContentPane(container);
		this.setVisible(true);
		go();
	}

	private void go(){
		nom = (String)JOptionPane.showInputDialog( null, "Entrez votre nom :", "Dialog", JOptionPane.PLAIN_MESSAGE);//pour demander entr�e
		while(! this.gamePanel.isGameOver()){//si different a game over
			gameInformationPanel.repaint(); //repaint affichage bloc top
			gamePanel.repaint();
			try {
				Thread.sleep(10);//vitesse temps
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
		gameInformationPanel.repaint();
		gamePanel.repaint();
		
		int dialogButton = JOptionPane.YES_NO_OPTION;//afficher boite de dialogue "recommencer".
		int dialogResult = JOptionPane.showConfirmDialog(this, "Partie termin�e, voulez-vous recommencer ?", "Game over !", dialogButton);
		if(dialogResult == 0) {
		  this.gamePanel.init();
		  go();
		} else {
		  System.exit(0);
		} 
	}

}
