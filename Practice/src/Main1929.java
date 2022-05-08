import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1929 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		boolean[] primeNumArr = new boolean[N + 1];
		primeNumArr[0] = true;
		primeNumArr[1] = true;
		
		for(int i = 2; i <= Math.sqrt(N); i++) {
			
			for(int j = i * i; j < primeNumArr.length; j += i) {
				if(primeNumArr[j]) continue; // 이미 지워진 숫자이면 패스
				primeNumArr[j] = true; // 소수가 아닌수를 지운다
			}//inner for
			
		}//outer for
		
		for(int i = M; i < primeNumArr.length; i++) {
			if(!primeNumArr[i]) {
				sb.append(i).append("\n");
			}//if
		}//for
		System.out.println(sb);
		
	}//main

}
