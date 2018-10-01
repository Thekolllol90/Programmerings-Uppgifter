package loopar;
import java.util.Scanner;
public class gangertabell {
	public static void main(String[] args) {
		Scanner boi = new Scanner(System.in);
		System.out.println("säg ett tal");
		int x = boi.nextInt(); 
		for (int i = 0; i<=10; i++) {
			System.out.println(x*i);	
		}
	boi.close();
	}
}
