package methods_läxa;

import java.util.Scanner;

public class string_backlänges {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String str = scanner.nextLine();
		
		
		 String res = boi(str);
		
		 System.out.println(res);
		 
		 scanner.close();
	}
	
	public static String boi(String str) {
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res += str.charAt(i);
		}
		
		return res;
	}
}
