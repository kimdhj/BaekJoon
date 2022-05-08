import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1929_1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		
		boolean[] primeNumArr = isPrime(M, N);
		StringBuilder sb = new StringBuilder();
		for(int i = M; i <= N; i++) {
			if(!primeNumArr[i]) sb.append(i).append("\n");
		}
		System.out.println(sb);
		
	}
	
	static boolean[] isPrime(int M, int N) {
		
		boolean[] primeNumArr = new boolean[N + 1];
		primeNumArr[0] = true;
		primeNumArr[1] = true;
		
		for(int i = 2; i <= Math.sqrt(N); i++) {
			for(int j = i * i; j < primeNumArr.length; j += i) {
				if(primeNumArr[j]) continue;
				primeNumArr[j] = true;
			}//inner for
		}//outer for
		
		return primeNumArr;
	}

}
