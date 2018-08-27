package cdi.projet.ihm.data.meteorite;

import javax.swing.JPanel;

import cdi.projet.ihm.component.GameInformationPanel;
import cdi.projet.ihm.data.avion.Avion;

public class MeteoriteIceberg extends MeteoriteGlace{
	
	private static final int DEGAT_VAL = 4;
	private static final int WIDTH = 60;
	private static final int SCORE_VAL = 5;

	public MeteoriteIceberg(JPanel p, Meteorite m, Avion pl) {
		super(p, m, pl);
	}
	
	@Override
	public String toString() {
		return "MeteoriteIceberg";
	}

	/**
	 * @return the degatVal
	 */
	public static int getDegatVal() {
		return DEGAT_VAL;
	}

	public int getWidth() {
		return WIDTH;
	}
	
	public static int getScoreVal() {
		GameInformationPanel.score+=SCORE_VAL;
		return GameInformationPanel.score;
    }
}

	
	


	
