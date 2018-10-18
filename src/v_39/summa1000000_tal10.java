package v_39;
import java.util.Scanner;
public class summa1000000_tal10 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int res = 1;
		boolean boi = true;
		Scanner scanner = new Scanner (System.in);
		while (boi) {
			System.out.println("Skriv ett tal");
			y = scanner.nextInt();
			res = res * y;
			x = x + 1;
			if (x >= 10 || res >= 100000) {
				boi = false; 
			}
		}
		System.out.println(res);
		System.out.print(x);
		scanner.close();
	}
}