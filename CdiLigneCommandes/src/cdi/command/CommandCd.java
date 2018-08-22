package cdi.command;

import java.io.File;

import cdi.command.constant.Constants;

class CommandCd extends AbstractCommand {

	public static final String CMD = "cd";
	
	public static final String DOUBLE_POINTS = "..";
	
	private String parameter;
	
	public CommandCd(String c) {
		// découpe le string c en partant de l'indice 2(=="cd".length), 
		// puis supprime tous les espaces en debut et fin avec la methode trim
		this.parameter = c.substring(CMD.length()).trim();
	}

	@Override
	public void run() {
		// si le parametre est un .., alors remonter d'un niveau
		if(DOUBLE_POINTS.equals(parameter)) {
			CommandFactory.CURRENT_FILE = CommandFactory.CURRENT_FILE.getParentFile();
		
		} else {
			boolean childFound = false;
			
			// parcourir la liste des sous repertoires et sous fichiers 
			// du repertoire en cours
			for(File child : CommandFactory.CURRENT_FILE.listFiles()) {
				// si le fils en cours a le meme nom que le parametre
				if (child.getName().equalsIgnoreCase(parameter) ) {
					// 
					if(child.isDirectory()) {
						CommandFactory.CURRENT_FILE = child;
					} else {
						System.out.println(Constants.PATH_NOT_A_DIRECTORY);
					}
					childFound = true;
					break;
				}
			}
			if ( ! childFound) {
				System.out.println(Constants.PATH_NOT_FOUND);
			}
		}
	}

	@Override
	public void println() {
		System.out.println(CMD+" "+this.parameter);
	}
	
	@Override
	public String getStringToPrint() {
		return CMD;
	}

}
