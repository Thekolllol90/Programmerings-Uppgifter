package v_39;
import java.util.Scanner;
public class radie_höjd_volym {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("säg en radie");
		double x = scanner.nextDouble(); 
		System.out.println("säg en höjd");
		double y = scanner.nextDouble();
		double res = 0;
		res = 3.14159265359 * x * x * y;
		System.out.println(res);
		scanner.close();
	}
}