package methods;

import java.util.Scanner;

public class olika_out_breoende_�lder {
	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	int x = scanner.nextInt();
	
	System.out.print(agecontrol(x));
	
	scanner.close();
	}
	
	public static String agecontrol(int x) {
		
		String y = "";
		
		if (x >= 0 && x <= 5) {
			y = "sm� barn f�r inte g�ra n�got";
		}
		else if (x >= 6 && x <= 12){
			y = "du f�r spela fortnite";
		}
		else if (x >= 13 && x <= 14) {
			y = "du �r ton�ring";
		}
		else if (x >= 15 && x <= 17) {
			y = "du f�r k�pa moppe";
		}
		else if (x >= 18 && x <= 19) {
			y = "du f�r k�pa bil";
		}
		else if (x >= 20 && x <= 64) {
			y = "du f�r g� p� systemet";
		}
		else if (x >= 65 && x <= 99) {
			y = "du �r pesioner";
		}
		else if (x >= 100) {
			y = "R.I.P" ;
		}
		
		
		return (y);
	}
}
