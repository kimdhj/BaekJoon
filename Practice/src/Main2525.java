import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2525 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int n = Integer.parseInt(br.readLine());
		
		m += n;
		
		while(m >= 60) {
				
			m -= 60;
			h++;
			
		}
		
		while(h >= 24) {

			h -= 24;
			
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(h).append(" ").append(m);
		System.out.println(sb);
		
		
	}

}
