import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2231 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			
		int N = Integer.parseInt(br.readLine());
		int length = (int)(Math.log10(N) + 1);
		
		int sum = 0;
		
		for(int i = 1; i < N; i++) {
			
			sum = i;
			int quotient = i;
			int remainder = 0;
			
			for(int j = 0; j < length; j++) {
				remainder = quotient % 10;
				quotient = quotient / 10;
				sum += remainder;				
			}//inner for	
			if(sum == N) {
				System.out.println(i);
				break;
			}
		}//outer for
		
		if(sum != N) System.out.println(0);//반복문 수행 후 나온 결과값이 입력값 N과 다르면 0 출력
	}

}
