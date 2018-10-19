package methods;

import java.util.Scanner;

public class olika_out_breoende_ålder {
	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	int x = scanner.nextInt();
	
	System.out.print(agecontrol(x));
	
	scanner.close();
	}
	
	public static String agecontrol(int x) {
		
		String y = "";
		
		if (x >= 0 && x <= 5) {
			y = "små barn får inte göra något";
		}
		else if (x >= 6 && x <= 12){
			y = "du får spela fortnite";
		}
		else if (x >= 13 && x <= 14) {
			y = "du är tonåring";
		}
		else if (x >= 15 && x <= 17) {
			y = "du får köpa moppe";
		}
		else if (x >= 18 && x <= 19) {
			y = "du får köpa bil";
		}
		else if (x >= 20 && x <= 64) {
			y = "du får gå på systemet";
		}
		else if (x >= 65 && x <= 99) {
			y = "du är pesioner";
		}
		else if (x >= 100) {
			y = "R.I.P" ;
		}
		
		
		return (y);
	}
}
