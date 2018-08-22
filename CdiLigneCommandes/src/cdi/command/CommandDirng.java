package cdi.command;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Calendar;

public class CommandDirng extends AbstractCommand {

	public static final  String CMD = "dirng";
	private File repertoireEnCours;

	public CommandDirng(File cURRENT_FILE) {
		repertoireEnCours = cURRENT_FILE ;

	}
	int nbrfiles () {
		return repertoireEnCours.list().length;
	}
	
//	String [] list(FilenameFilter repertoireEnCours ) {
//		return 
//	}

	@Override
	public void run() {
		System.out.println(nbrfiles());
	}


	@Override
	public String getStringToPrint() {
		return CMD;
	}


}
