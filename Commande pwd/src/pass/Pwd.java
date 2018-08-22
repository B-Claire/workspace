package pass;

import java.util.ArrayList;
import java.util.Scanner;

public class Pwd {

	public static void pwd() {
	
		
		
		String error = "command is not find";
		String quit = "exit";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("_");
		String input = keyboard.nextLine();
		ArrayList <String> list = new ArrayList<> ();//creation array list
		while (!input.equals(quit)) {
			list.add(input);
			if (input.equals("pwd")) {
				System.out.println("ok");
			} else if(input.equals("hist")) {
				for (int i=0 ; i<= list.size()-1; i++) {//parcourir liste
						System.out.println(list.get(i));
				}
			} else {
				System.out.println(error);
			}
			System.out.println("_");
			input = keyboard.nextLine();
		}
		keyboard.close();
	}
		
	
			
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Pwd.pwd();
		
	}

}
