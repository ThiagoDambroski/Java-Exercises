package robotExercise;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the inital x: ");
		int x = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter the inital y: ");
		int y = sc.nextInt();
		System.out.println();
		
		Cardinal cardinal = new Cardinal(x, y);
		Robot robot = new Robot(Direction.NORTH,cardinal);
		
		System.out.print("Enter the string With the directions: ");
		String str = sc.next();
		
		String[] array = str.split("");
		for (String c : array) {
			robot.moving(c.toUpperCase());
		}
		
		System.out.println(robot.getCardinal());
		sc.close();

	}

}
