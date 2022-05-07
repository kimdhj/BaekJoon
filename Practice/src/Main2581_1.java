import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2581_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		boolean[] primeNumArr = new boolean[N + 1];
		primeNumArr[0] = true;
		primeNumArr[1] = true;
		
		for(int i = 2; i <= Math.sqrt(N); i++) {
			if(primeNumArr[i]) continue;
		
			for(int j = i * i; j < primeNumArr.length; j += i) {
				primeNumArr[j] = true;
			}//inner for
			
		}//outer for
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i = M; i < primeNumArr.length; i++) {
			if(!primeNumArr[i]) {
				if(min == Integer.MAX_VALUE) {
					min = i;
				}
				sum += i;
			}
		}//for
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		
	}//main
	
}
