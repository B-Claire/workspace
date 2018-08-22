package cdi.main;

import cdi.command.CommandFactory;
import cdi.command.ICommand;
import cdi.command.IExitCommand;
import cdi.command.constant.Constants;
import cdi.command.tools.Keyboard;

public class Program {
	
	public static void main(String[] args) {
		execute();
		//si on veut faire une instanciation de CommandCd il faut passer la visibilité 
		//de defaut à public 
	}
	
	

	public static void execute() {
		System.out.println("-- CDI command line --");
		String cmdStr;
		boolean exitCommand = false;
		do {
			System.out.print("> ");
			cmdStr = Keyboard.readLine();
			ICommand command = CommandFactory.create(cmdStr);
			if(command != null) {
				command.run();
				exitCommand = command instanceof IExitCommand;
				
			} else {
				System.out.println(Constants.COMMAND_NOT_FOUND);
			}
		}while(! exitCommand);
		
		
		
		
	}
}
