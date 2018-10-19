package methods;

import java.util.Scanner;

public class trappa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		
		stair(x);
		
		scanner.close();
	}
	
	public static void stair(int x) { //minskar mellan rummen och ökar x en gång per lopp som är bestämt från input
		char space = ' ';
		char ex = 'x';
		int y = 0;
		int z = x + 2;
	for (int i = 0; i <= x; i++) {
		y = y + 1;
		z = z - 1;
		for (int j = y; j <= x; j++) {
			System.out.print(space);
		}
		for (int a = z; a <= x; a++) {
			System.out.print(ex);
		}
		System.out.println("");
	}
	
	}
}
