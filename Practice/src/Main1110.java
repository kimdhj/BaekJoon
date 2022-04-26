import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main1110 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = N;
		int cnt = 0;
		boolean flag = true;
		br.close();
		
		while(flag) {
			
			int nextNum = (N / 10) + (N % 10);
			cnt++;
			
			N = ((N % 10) * 10) + (nextNum % 10);
			if(N == M) {
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				bw.write(String.valueOf(cnt));
				bw.flush();
				bw.close();
				break;
			}
			
		}//while
		
	}
	
}