import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1978 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int primeNumCnt = 0;
		int primeNumCheck = 0;
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num <= 1) {
				continue;
			}
			
			for(int j = 1; j <= num; j++) {
				if(num % j == 0) {
					primeNumCheck++;
				}
			}//inner for
			
			if(primeNumCheck == 2) {
				primeNumCnt++;
			}
			
			primeNumCheck = 0;
			
		}//for
		
		System.out.println(primeNumCnt);
		
	}//main
	
}
