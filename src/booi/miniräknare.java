package booi;
import java.util.Scanner;
public class miniräknare {
	public static void main(String[] args) {
		
		String operation;
		boolean run = true; //gör så att miniräknaren loppar. 
		
		Scanner scanner = new Scanner(System.in);
		while(run) { 
			
			System.out.println("säg ett tal");
			double x = scanner.nextDouble(); //skriver samtidigt som den tar emot en input. 
			
			System.out.println("säg ett till tal");
			double y = scanner.nextDouble();
			
			System.out.println("vad vill du göra med ditt tal?");
			System.out.println("1. plus  2. minus  3. gånger  4. delatmed");
			
			operation = scanner.next(); // låter dig välja olika operationer. 
			
			if (operation.equals("1"))
			{
				System.out.println("svaret är " + ( x + y));
			}
			if (operation.equals ("2"))
			{
				System.out.println("svaret är " + ( x - y));
			}
			if (operation.equals ("3"))
			{
				System.out.println("svaret är " + ( x * y));
			}
			if (operation.equals ("4"))
			{
				System.out.println("svaret är " + ( x / y));
			}
			boolean boi = true;
			
			while(boi)
			{			
				System.out.println("vill du göra en till?");
				operation = scanner.next();
				if (operation.toLowerCase().equals("nej")) // oavset om du skriver med stor eller liten bokstav så gör den det till liten. 
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