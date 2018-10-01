package loopar;

public class increas_by_one {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		boolean a = true;
			while(a) {
				y=y+1;
				x=x+y;
				if(y == 100){
					a = false;
				}
			}
		System.out.println(x);
	}
}