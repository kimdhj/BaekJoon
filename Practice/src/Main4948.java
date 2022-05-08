import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4948 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean flag = true;
		StringBuilder sb = new StringBuilder();
		
		while(flag) {
			
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			
			sb.append(isPrime(n)).append("\n");
			
		}//while
		System.out.println(sb);
		
		
	}//main
	
	static int isPrime(int n) {
		int cnt = 0;
		int m = n * 2;
		
		boolean[] primeNumArr = new boolean[m + 1];
		primeNumArr[0] = true;
		primeNumArr[1] = true;
		
		for(int i = 2; i <= Math.sqrt(m); i++) {
			
			for(int j = i * i; j < primeNumArr.length; j += i) {
				
				if(primeNumArr[j]) continue;
				primeNumArr[j] = true;
				
			}//inner for
			
		}//outer for
		
		for(int i = n + 1; i <= m; i++) { // 입력한 n보다 크고 2n보다 작거나 같은 소수
			if(!primeNumArr[i]) {
				cnt++;
			}
		}
		return cnt;
	}//isPrime

}
