package loopar;
import java.util.Scanner;
public class n�r_exit_skrivs_avsluta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		boolean boi = true;
		while (boi) {
			System.out.println("skriv n�got");
			String ett=scanner.nextLine();
			if (ett.toLowerCase().equals("exit")) {
				boi = false;
			}
		}
		scanner.close();
	}
}
