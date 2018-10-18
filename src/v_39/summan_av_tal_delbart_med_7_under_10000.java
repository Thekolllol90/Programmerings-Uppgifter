package v_39;

public class summan_av_tal_delbart_med_7_under_10000 {
	public static void main(String[] args) {
		int res = 0;
		for (int i = 0; i <= 10000; i++ ) {
			if (i % 7 == 0) {
				res += i;
			}
		}
		System.out.println(res);
	}

}
