package cdi.projet.ihm.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fenetre extends JFrame {

	private static final long serialVersionUID = 1L;// serialiser les donné (les mettre en tableaux)
	private GamePanel gamePanel;
	private GameInformationPanel gameInformationPanel;
	private JPanel container = new JPanel();
	protected static String nom;// pour mettre le nom
	private ArrayList<String> scoreList = null;
	private static final Date aujourdhui = new Date();
	private static DateFormatSymbols monDFS = new DateFormatSymbols();
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", monDFS);


	

	public Fenetre() {
		this.setTitle("CDI swing Ihm");
		this.setSize(500, 500);
		this.getAlignmentY();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());

		gamePanel = new GamePanel();
		container.add(gamePanel, BorderLayout.CENTER);

		gameInformationPanel = new GameInformationPanel(gamePanel);
		container.add(gameInformationPanel, BorderLayout.NORTH);// bloc top

		this.setContentPane(container);
		this.setVisible(true);
		go();
	}

	private void loadScore() {// pr charger depuis le fichier
		this.scoreList = new ArrayList<String>();
		try {// lecture de la liste
			InputStream flux = new FileInputStream("scoreList.txt");
			InputStreamReader lecture = new InputStreamReader(flux);
			BufferedReader buff = new BufferedReader(lecture);
			String ligne;
			while ((ligne = buff.readLine()) != null) {
				scoreList.add(ligne);
			}
			buff.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	private void saveScore() {// pr sauvegarder les donnees
		try {// ecrire dans un fichier
			PrintWriter writer = new PrintWriter("scoreList.txt", "UTF-8");
			for (int i = 0; i < scoreList.size(); i++) {
				writer.println(scoreList.get(i));
			}
			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void go() {
		boolean isValid = false;
		while (!isValid) {

			String nomTmp = JOptionPane.showInputDialog(null, "entrer votre nom:", "Dialog", JOptionPane.PLAIN_MESSAGE);
			if (nomTmp == null || nomTmp.length() < 3 || nomTmp.length() > 6) {
				isValid = false;
			} else {
				for (int i = 0; i < nomTmp.length(); i++) {
					if (nomTmp.charAt(i) == ';') {
						isValid = false;
						break;
					} else {
						isValid = true;
						nom = nomTmp;
					}
				}

			}

		}

		while (!this.gamePanel.isGameOver()) {
			gameInformationPanel.repaint();
			gamePanel.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		gameInformationPanel.repaint();
		gamePanel.repaint();

		this.loadScore();
		this.scoreList.add(Fenetre.nom + ";" + GameInformationPanel.score + ";" + dateFormat.format(aujourdhui));
		this.saveScore();
		
		String[] options = {"Relancer une nouvelle partie ", "Sortir du jeu", "Afficher les Scores"};
		int x = JOptionPane.showOptionDialog(null, " Game Over! ",
                "Game Over",
		
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	    System.out.println(x);
	    
		if (x == 0) {
			this.gamePanel.init();
		go();
		} else if (x == 1){
		System.exit(0);
			} else {
				
			}
	}

	}


