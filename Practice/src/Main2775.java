import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2775 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int[][] roomNum = new int[15][14];
		for(int i = 0; i < roomNum[0].length; i++) { // 0층 인원수 입력
			roomNum[0][i] = i + 1;
		}
					
		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			for(int a = 1; a <= k; a++) {
				roomNum[a][0] = 1;
				for(int b = 1; b < n; b++) {
					
					roomNum[a][b] = roomNum[a][b-1] + roomNum[a-1][b];
					
				}//inner inner for
			}//inner for
			sb.append(roomNum[k][n - 1]).append("\n");
		}//outer for
		System.out.println(sb);
	}

}
