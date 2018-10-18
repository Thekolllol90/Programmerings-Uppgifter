package v_39;
import java.util.Scanner;
public class kvadrat_från_input {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("skriv ett tal");
		int x = scanner.nextInt();
		
		for (int i = 0; i < x; i++) {
			System.out.print("$");
			for (int j = 0; j < x - 2; j++) {
				if (i == 0 || i == x - 1) {
					System.out.print("$");
				}
				else {
					System.out.print(" ");
				}
			}
			if (x != 1) {
				System.out.println("$");
			}
		}
		scanner.close();
	}
}
