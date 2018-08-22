package cdi.command;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

class CommandHist extends AbstractCommand {

	public static final String CMD = "hist";

	private List<ICommand> commandList;

	public CommandHist(List<ICommand> cl) {
		this.commandList = cl;	
	}

	@Override
	public void run() {
		for(ICommand c : this.commandList) {
			c.println();
		}
	}

	@Override
	public String getStringToPrint() {
		return CMD;
	}

	public String histClear() {
		return CMD;
		
	}
	
		
	public static void main(String[] args) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy"+" "+"k:m:ss", Locale.FRENCH);
		
		String dateStr = simpleDateFormat.format(new Date());
		
		System.out.println(dateStr);
		
		
	}


//public static void DateDernierAcces(int annee, int mois, int jour, int heure, int minute, int seconde, File file){

       

       //(annee, mois, jour, heure, minute, seconde);


//}
}
