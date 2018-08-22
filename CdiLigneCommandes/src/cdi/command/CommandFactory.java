package cdi.command;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class CommandFactory {
	
	public static File CURRENT_FILE = new File(System.getProperty("user.dir"));
	
	public static List<ICommand> COMMAND_LIST = new ArrayList<>();
	
	public static ICommand create(String cmd) {
		ICommand theCommand = null;
		
		if(cmd == null || cmd.length() == 0) {
			return theCommand;
		
		} else if(CommandPwd.CMD.equalsIgnoreCase(cmd)) {
			theCommand = new CommandPwd();
			
		} else if(CommandHist.CMD.equalsIgnoreCase(cmd)) {
			theCommand = new CommandHist(COMMAND_LIST);
			
		} else if(CommandExit.CMD.equalsIgnoreCase(cmd)) {
			theCommand = new CommandExit();
			
		} else if(CommandDir.CMD.equalsIgnoreCase(cmd)) {
			theCommand = new CommandDir();
			
		} else if(cmd.toLowerCase().startsWith(CommandCd.CMD+" ")) {
			theCommand = new CommandCd(cmd);

		} else if(CommandFin.CMD.equalsIgnoreCase(cmd)) {
			theCommand = new CommandFin();
			
		}
		else if (CommandHistClear.CMD.equalsIgnoreCase(cmd)) {
			theCommand = new CommandHistClear(COMMAND_LIST);
		}
		else if (CommandDirng.CMD.equalsIgnoreCase(cmd)) {
			theCommand = new CommandDirng(CURRENT_FILE);
			
		}
		
		
		if(theCommand != null) {
			COMMAND_LIST.add(theCommand);
		}
		
		return theCommand;
	}

}
