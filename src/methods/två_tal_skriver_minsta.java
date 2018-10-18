package methods;

import java.util.Scanner;

public class två_tal_skriver_minsta {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int res = 0;
		
			res = boi(a,b);
			
		System.out.println(res);
			
			
		scanner.close();
	}
	
	public static int boi(int a, int b){
		if (a >= b) {
			return b;
		}
		if (b >= a) {
			return a;
		}

		return 0;
	}
}

