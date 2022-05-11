import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1920_1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		boolean[] primeNumArr = isPrime();
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
						
			for(int j = n / 2; j >= 2; j--) {
				
				if(!primeNumArr[j] && !primeNumArr[n - j]) {
					sb.append(j).append(" ").append(n - j).append("\n");
					break;
				}
				
			}//inner for
					
		}//outer for
		
		System.out.println(sb);
		
	}//main
	
	static boolean[] isPrime() {
		boolean[] primeNumArr = new boolean[10000 + 1];
		
		primeNumArr[0] = true;
		primeNumArr[1] = true;
		
		for(int i = 2; i < Math.sqrt(10000); i++) {
			
			for(int j = i * i; j < primeNumArr.length; j += i) {
				
				if(primeNumArr[j]) continue;
				primeNumArr[j] = true;
				
			}//inner for
			
		}//outer for
		
		return primeNumArr;
	}//isPrime
	
}
