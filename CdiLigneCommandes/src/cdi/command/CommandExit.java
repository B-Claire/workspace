package cdi.command;

class CommandExit extends AbstractCommand {

	public static final String CMD = "exit";
	
	@Override
	public void run() {
		System.out.println("");
	}

	@Override
	public String getStringToPrint() {
		return "";
	}
	
}
