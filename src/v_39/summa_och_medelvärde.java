package v_39;

import java.util.Scanner;

public class summa_och_medelvärde {
	public static void main(String[] args) {
		Scanner boi = new Scanner(System.in);
		boolean a = true;
		int y = 0;
		int res = 0;
		int count = 0;
		while(a)
		{
			int x = boi.nextInt();
			if (x == 0) 
			{
				a = false; 
				break;
			}
			
			count ++; 
			
			y += x;
		}
		res = y / count;
		System.out.println(y);
		System.out.println(res);
		
		boi.close();
	}
}