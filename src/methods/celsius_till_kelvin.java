package methods;

import java.util.Scanner;

public class celsius_till_kelvin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double celsius = scanner.nextDouble();
		
		System.out.println(kelvin(celsius));
		
		
		scanner.close();
	}
	public static double kelvin(double celsius) {
		double kel = celsius + 273.15;
		
		return kel;
	}
}