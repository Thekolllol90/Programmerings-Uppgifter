package booi;

import java.util.Scanner;

public class vad_�r_ditt_namn {
	public static void main(String[] args) {
		Scanner boi = new Scanner(System.in); 										//skapar en ny scanner.
		
		System.out.println("vad hetter du?");
		String hej=boi.nextLine(); 													// string kommer ih�g bokst�ver och siffror.
		
		System.out.println("vad �r din addres?");
		String gg=boi.nextLine();
		
		System.out.println("vad �r ditt telefon nummer?");
		String tel=boi.nextLine();
		
		System.out.println("vilken kalss g�r du i?");
		String klass=boi.nextLine();
		System.out.println();
		
		System.out.println("Ditt namn �r: " + hej + "\nDu bor p�: " + gg); 			// skappar en ny line.
		System.out.println("Ditt telefon numer �r: " + tel);
		System.out.println("Du g�r i klass: " + klass);
		
		boi.close();
	}
}
