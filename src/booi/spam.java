package booi;

public class spam {
	public static void main(String[] args) {
		boolean spam = true;
		int counter = 0;
		while(spam) {
			if (counter >= 200) {
				spam=false;
				break;
			}
			
			System.out.println("boi");
			counter++;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
