package methods;

import java.util.Scanner;

public class från_1_till_input {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int n = scanner.nextInt();
		count(n);
		
		scanner.close();
		
	}
	
	
	public static void count(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i);
		}
	}
}
