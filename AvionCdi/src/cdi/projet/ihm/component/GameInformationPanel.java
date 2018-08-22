package cdi.projet.ihm.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import cdi.projet.ihm.tools.Util;

public class GameInformationPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private Image imgMiddle = Util.getImg("resources/img/avion/avion_middle_position.png");
	private Image bitCoin = Util.getImg("resources/img/Score.png");
	private JLabel nbViesLabel;
	private JLabel scoreLabel;
	private JLabel nomJoueur;//pour ajouter nom joueur
	private GamePanel gamePanel;
	
	public GameInformationPanel(GamePanel pan) {
		this.gamePanel = pan;
		this.nbViesLabel = new JLabel(Integer.toString(this.gamePanel.getPlane().getNbVies()));//label nbr vie
		this.scoreLabel = new JLabel(Integer.toString(this.gamePanel.getPlane().getScore()));//label score
		this.nomJoueur = new JLabel(Fenetre.nom);//label joueur
		this.nomJoueur.setHorizontalAlignment(JLabel.CENTER);//alignement joueur 
		this.setBackground(Color.CYAN);
		this.setPreferredSize(new Dimension(500, 26));
		BorderLayout borderLayout = new BorderLayout();
		this.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 7));
		this.setLayout(borderLayout);
		this.add(this.nbViesLabel,BorderLayout.EAST);
		this.add(this.scoreLabel,BorderLayout.WEST);
		this.add(this.nomJoueur,BorderLayout.CENTER);//aligemennt nom joueur 2eme partie
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.nbViesLabel.setText(Integer.toString(this.gamePanel.getPlane().getNbVies()));
		this.nbViesLabel.repaint();
		this.scoreLabel.setText("         "+Integer.toString(this.gamePanel.getPlane().getScore()));
		this.scoreLabel.repaint();
		this.nomJoueur.setText(Fenetre.nom);
		this.nomJoueur.repaint();
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.drawImage(imgMiddle, 452, 3, 20, 20, this);
		g2d.drawImage(bitCoin, 5, 3, 20, 20, this);
	}
	
}