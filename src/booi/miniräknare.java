package booi;
import java.util.Scanner;
public class minir�knare {
	public static void main(String[] args) {
		
		String operation;
		boolean run = true; //g�r s� att minir�knaren loppar. 
		
		Scanner scanner = new Scanner(System.in);
		while(run) { 
			
			System.out.println("s�g ett tal");
			double x = scanner.nextDouble(); //skriver samtidigt som den tar emot en input. 
			
			System.out.println("s�g ett till tal");
			double y = scanner.nextDouble();
			
			System.out.println("vad vill du g�ra med ditt tal?");
			System.out.println("1. plus  2. minus  3. g�nger  4. delatmed");
			
			operation = scanner.next(); // l�ter dig v�lja olika operationer. 
			
			if (operation.equals("1"))
			{
				System.out.println("svaret �r " + ( x + y));
			}
			if (operation.equals ("2"))
			{
				System.out.println("svaret �r " + ( x - y));
			}
			if (operation.equals ("3"))
			{
				System.out.println("svaret �r " + ( x * y));
			}
			if (operation.equals ("4"))
			{
				System.out.println("svaret �r " + ( x / y));
			}
			boolean boi = true;
			
			while(boi)
			{			
				System.out.println("vill du g�ra en till?");
				operation = scanner.next();
				if (operation.toLowerCase().equals("nej")) // oavset om du skriver med stor eller liten bokstav s� g�r den det till liten. 
				{
					run = false;	//stoppar loppen.
					boi = false;
				}
				
				if (operation.toLowerCase().equals("ja"))
				{
					boi = false;
					run = true;
				}
			}
		}
		
		scanner.close();
	}
}