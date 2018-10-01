package loopar;
import java.util.Scanner;
public class tar_ett_tal_och_skriver_fakultet {
	public static void main(String[] args) {
		Scanner boi = new Scanner (System.in);
		boolean a = true;
		while(a) {
		System.out.println("säg ett tal");
		int x = boi.nextInt();
		int res = 1;
		for (int i = 1; i<=x; i++) {
			res *= i;  
		}
		
		System.out.println(res);
		}
		boi.close();
	}
}