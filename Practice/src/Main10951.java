import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main10951 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		StringBuilder sb = new StringBuilder();
		while((str = br.readLine()) != null) {
			try {
				StringTokenizer st = new StringTokenizer(str, " ");
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				sb.append(A + B).append("\n");
			} catch(Exception e) {
				break;
			}
		}//while
		System.out.println(sb);

	}

}