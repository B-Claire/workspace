package cdi.command.tools;

import java.util.Scanner;

public class Keyboard {

	private static Scanner scanner = new Scanner(System.in);
	
	public static int readInt(){
		return scanner.nextInt();
	}
	
	public static String readWord(){
		return scanner.next();
	}
	
	public static String readLine(){
		return scanner.nextLine();
	}
}