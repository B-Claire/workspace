package cdi.projet.ihm.tools;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

public final class Util {

	private Util() {
	}
	
	public static Image getImg(String s)  {
		Image res = null;
		try {
			res = ImageIO.read(Util.class.getResourceAsStream(s));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}
	
}

