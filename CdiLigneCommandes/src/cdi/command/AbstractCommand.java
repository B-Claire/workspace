package cdi.command;

import java.text.SimpleDateFormat;
import java.util.Date;

abstract class AbstractCommand implements ICommand {
	
	private Date dateCreation;
	
	private static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	
	
	public abstract String getStringToPrint();
	
	public 
	@Override
	public void println() {
		System.out.println(this.getStringToPrint());
		
		
	}
}
