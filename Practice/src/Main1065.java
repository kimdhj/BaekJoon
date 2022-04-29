import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main1065 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int hanNumCnt = hanNum(n);
		System.out.println(hanNumCnt);
	}
	
	static int hanNum(int n) {
		int cnt = 0;
		if(n < 100) {
			return n;
		} else {
			cnt = 99;
		}
		
		if(n >= 1000) {
			n = 999;
		}
		
		for(int i = 100; i <= n; i++) {
			int hundreds = i / 100;
			int tens = (i % 100) / 10;
			int units = i % 10;
			
			if((hundreds - tens) == (tens - units)) {
				cnt++;
			}
		}
			
		return cnt;
	}
	
	
}