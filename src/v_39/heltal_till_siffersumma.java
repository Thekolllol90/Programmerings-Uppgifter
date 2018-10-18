package v_39;
import java.util.Scanner;
public class heltal_till_siffersumma {
	public static void main(String[] args) {
		Scanner boi = new Scanner (System.in);
		
		int x = boi.nextInt();
		int res = 0;
		
		while (true)
		{
			res += x % 10;
			x /= 10; 
			if (x == 0) 
			{
				break;
			}
		}
		System.out.println(res);
		boi.close();
	}
}
