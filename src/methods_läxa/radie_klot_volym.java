package methods_läxa;

import java.util.Scanner;

public class radie_klot_volym {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double r = scanner.nextDouble();
		double res = boi(r);
		
		System.out.print(res);
		scanner.close();
	}
	public static double boi(double r) {
		 double res = (4 * Math.PI * Math.pow(r, 3)) / 3;
		 return res;
	}
		
}
