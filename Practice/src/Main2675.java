import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2675 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			for(int j = 0; j < s.length(); j++) {

				for(int k = 0; k < r; k++) {
				
					sb.append(s.charAt(j));	
			
				}//inner inner for
			
			}//inner for
			sb.append("\n");
		}//for
		System.out.println(sb);
		
		br.close();
		
	}//main

}
