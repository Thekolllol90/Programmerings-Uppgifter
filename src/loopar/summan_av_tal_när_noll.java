package loopar;
import java.util.Scanner;
public class summan_av_tal_när_noll {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 1;
		int y = 0;
		while (x>0) {
			x = 0;
			System.out.println("skriv ett tal");
			x = scanner.nextInt();
			y = y + x;
		}
		System.out.println("Ditt tal är " + y);
		scanner.close();
	}
}
