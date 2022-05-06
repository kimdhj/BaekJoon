import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10250 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < line; i++) {
			st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int roomNum = 0;
			if(n % h == 0) {
				roomNum = h * 100 + (n / h);
				sb.append(roomNum).append("\n");
			} else {
				roomNum = (n % h) * 100 + (n / h + 1);
				sb.append(roomNum).append("\n");
			}			
			
		}//for
		System.out.println(sb);
	}

}
