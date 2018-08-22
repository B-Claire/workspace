package cdi.command;

class CommandDir extends AbstractCommand {

	public static final String CMD = "dir";
	
	@Override
	public void run() {
		String[] filesList = CommandFactory.CURRENT_FILE.list();
		for(String childFile : filesList) {
			System.out.println(childFile);
		}
	}

	@Override
	public String getStringToPrint() {
		return CMD;
	}

	public String dirng() {
		return CMD;
		
	}
}
