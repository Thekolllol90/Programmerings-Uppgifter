package v_39;
import java.util.Scanner;
public class tar_tv�_skriver_det_minsta {
	public static void main(String[] args) {
		Scanner boi = new Scanner (System.in);
			System.out.println("skriv ett tal");
			int x = boi.nextInt();
			System.out.println("skriv ett till tal");
			int y = boi.nextInt();
			if (y < x) {
				System.out.print("ditt tal �r " + y);
			}
			if (x < y) {
				System.out.println("ditt tal �r " + x);
		}
		boi.close();
	}
}