package cdi.command;

import java.util.List;

public class CommandHistClear extends AbstractCommand {

	public static final  String CMD = "clearhist";
	
	private List<ICommand> clairList;
	
	public CommandHistClear(List<ICommand> cl) {
		clairList = cl;

	}

	
	@Override
	public void run() {
		clairList.clear();
	}


	@Override
	public String getStringToPrint() {
		return CMD;
	}

}
