package v_39;
import java.util.Scanner;
public class timmar_minuter_till_sekunder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("antal timmar?");
		int x = scanner.nextInt();
		
		System.out.println("antal minuter?");
		int y = scanner.nextInt();
		
		System.out.println("antal sekunder?");
		int z = scanner.nextInt();
		
		
		while (x > 0) {
			x = x - 1;
			y = y + 60;
		}
		while  (y > 0) {
			y = y - 1;
			z = z + 60;
		}
		
		System.out.println("antal sekunder är " + z);
		scanner.close();
	}
}
