package booi;

import java.util.Scanner;

public class vad_är_ditt_namn {
	public static void main(String[] args) {
		Scanner boi = new Scanner(System.in); 										//skapar en ny scanner.
		
		System.out.println("vad hetter du?");
		String hej=boi.nextLine(); 													// string kommer ihåg bokstäver och siffror.
		
		System.out.println("vad är din addres?");
		String gg=boi.nextLine();
		
		System.out.println("vad är ditt telefon nummer?");
		String tel=boi.nextLine();
		
		System.out.println("vilken kalss går du i?");
		String klass=boi.nextLine();
		System.out.println();
		
		System.out.println("Ditt namn är: " + hej + "\nDu bor på: " + gg); 			// skappar en ny line.
		System.out.println("Ditt telefon numer är: " + tel);
		System.out.println("Du går i klass: " + klass);
		
		boi.close();
	}
}
