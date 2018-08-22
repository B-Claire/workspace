package cdi.command;

class CommandPwd extends AbstractCommand {

	public static final String CMD = "pwd";
	
	@Override
	public void run() {
		System.out.println(CommandFactory.CURRENT_FILE.getAbsolutePath());
	}

	@Override
	public String getStringToPrint() {
		return CMD;
	}

}
