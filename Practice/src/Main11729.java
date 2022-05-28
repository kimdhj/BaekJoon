import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11729 {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		sb.append((int)Math.pow(2, num) - 1).append("\n");
		
		hanoi(1, 2, 3, num);
		
		System.out.println(sb);
		
		
	}
	
	static void hanoi(int from, int mid, int to, int num) {
		
		if(num == 1) {
			sb.append(from).append(" ").append(to).append("\n");
			return;
		}
		
		hanoi(from, to, mid, num - 1);		
		
		sb.append(from).append(" ").append(to).append("\n");
		
		hanoi(mid, from, to, num - 1);
		
	}
	
}
