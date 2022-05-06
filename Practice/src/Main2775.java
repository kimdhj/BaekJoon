import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2775 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] peopleNum = new int[15][14];
		for(int i = 0; i < peopleNum[0].length; i++) { // 0층 초기화
			peopleNum[0][i] = i + 1;
		}
		
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			for(int a = 1; a <= k; a++) {
				peopleNum[k][0] = 1;
				for(int b = 1; b < n; b++) {
					peopleNum[k][b] = peopleNum[k][b-1] + peopleNum[k-1][b];
				}
			}
			sb.append(peopleNum[k][n-1]).append("\n");
		}
		System.out.println(sb);
	}
	
}