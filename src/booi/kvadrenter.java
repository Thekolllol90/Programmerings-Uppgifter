package booi;
import java.util.Scanner;
public class kvadrenter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("vad �r ditt x v�rde");
		int x = scanner.nextInt();
			System.out.println("vad �r ditt y v�rde");
		int y = scanner.nextInt();
		scanner.close();
		if(x>0 && y>0) { 
			System.out.println("kvadrant 1");
		}else if(x<0 && y>0) {
			System.out.println("kvadrant 2");
		}else if(x<0 && y<0) {
			System.out.println("kvarant 3");
		}else if (x>0 && y<0) {
			System.out.println("kvadrant 4");
		}
	}

}
