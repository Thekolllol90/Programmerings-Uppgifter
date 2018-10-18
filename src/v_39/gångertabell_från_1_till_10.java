package v_39;

public class gångertabell_från_1_till_10 {
	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		for (int i = 0; i < 10; i++) {
			y = y + 1;
			for (int j = 0; j < 10; j++) {
			System.out.print(y * x + " ");
			x = x + 1;
			}
			System.out.println();
			x = 1;
		}
	}
}
