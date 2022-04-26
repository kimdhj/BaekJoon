import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main10818 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int max = 0;
		int min = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(i == 0) {
				max = a;
				min = a;
			} else {
				if(a > max) {
					max = a;
				} else if(a < min) {
					min = a;
				} //inner if else
			} // outer if else
		} // for
		StringBuilder sb = new StringBuilder();
		sb.append(min).append(" ").append(max);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
	}
	
}