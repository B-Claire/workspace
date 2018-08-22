package pack_Button;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sdz.mode1.Horloge;

public class Fenetre_B extends JFrame implements ActionListener {
	private Panneau1 pan = new Panneau1();
	private JButton bouton = new JButton("Car 1");
	private JButton bouton2 = new JButton("Voiture 2");
	private JPanel container = new JPanel();
	private JLabel label = new JLabel("LAB MI");
	private Horloge horloge;
	private int compteur = 0;
	private boolean animated = true;
	private boolean backX, backY;
	private int x, y;

	public Fenetre_B() {

		this.setTitle("Animation");
		this.setSize(300, 300);
		// On initialise l'horloge
		this.horloge = new Horloge();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		container.add(pan, BorderLayout.CENTER);

		// ***********************************************//

		// Premi�re classe �coutant mon premier bouton
		bouton.addActionListener(this);
		// Deuxi�me classe �coutant mon premier bouton
		bouton.addActionListener(new Bouton3Listener());

		bouton2.addActionListener(this);
		// ***************************************************//
		JPanel south = new JPanel();
		south.add(bouton);
		south.add(bouton2);
		container.add(south, BorderLayout.SOUTH);

		// ********************************************//
		Font police = new Font("TimesNewRoman", Font.BOLD, 16);
		label.setFont(police);
		label.setForeground(Color.black);
		label.setHorizontalAlignment(JLabel.CENTER);
		container.add(label, BorderLayout.NORTH);

		// ******************************************//
		this.setContentPane(container);
		this.setVisible(true);
		go();
	}

	private void go() {

		// deuxieme methode (optimis�e): boucle while => s'arr�t mais ne redemmare pas
		// Les coordonn�es de d�part de notre rond
		x = pan.getPosX();
		y = pan.getPosY();
		
		while (this.animated) {
			if (x < 1)
				backX = false;
			if (x > pan.getWidth() - 50)
				backX = true;
			if (y < 1)
				backY = false;
			if (y > pan.getHeight() - 50)
				backY = true;
			if (!backX)
				pan.setPosX(++x);
			else
				pan.setPosX(--x);
			if (!backY)
				pan.setPosY(++y);
			else
				pan.setPosY(--y);
			pan.repaint();

			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// premiere methode : boucle for => elle est infinie
		/*for (int i = -50; i < pan.getWidth(); i++) {
			int x = pan.getPosX(), y = pan.getPosY();
			x++;
			y++;
			pan.setPosX(x);
			pan.setPosY(y);
			pan.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if (arg0.getSource() == bouton)
			label.setText("Vous avez cliqu� sur le bouton 1");

		if (arg0.getSource() == bouton2)
			label.setText("Vous avez cliqu� sur le bouton 2");
	}

	// *************************************//
	// Classe �coutant notre premier bouton
	class BoutonListener implements ActionListener {
		// Red�finition de la m�thode actionPerformed()
		public void actionPerformed(ActionEvent arg0) {
			label.setText("Vous avez cliqu� sur le bouton 1");
		}
	}

	// Classe �coutant notre second bouton
	class Bouton2Listener implements ActionListener {
		// Red�finition de la m�thode actionPerformed()
		public void actionPerformed(ActionEvent e) {
			animated = true;
			bouton.setEnabled(false);
			bouton2.setEnabled(true);
			go();
			label.setText("Vous avez cliqu� sur le bouton 2");
		}
	}

	// Classe �coutant notre bouton
	class Bouton3Listener implements ActionListener {
		// Red�finition de la m�thode actionPerformed()
		public void actionPerformed(ActionEvent e) {
			animated = false;
			bouton.setEnabled(true); // Le bouton est cliquable
			bouton2.setEnabled(false);// Le bouton n'est plus cliquable
			System.out.println("Ma classe interne num�ro 3 �coute bien !");
		}
	}

}
