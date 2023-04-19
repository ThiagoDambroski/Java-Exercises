package bobExercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bob bob;
		
		while(true) {
			 String input = "";
			 System.out.println("What u wanna say to bob ? ");
			 input = sc.nextLine();
			 if(input.equals("close")) {
				 break;
			 }
			 else {
				 bob = new Bob(input);
				 System.out.println(bob.response());
				 
			 }
		}
		
		sc.close();

	}

}
