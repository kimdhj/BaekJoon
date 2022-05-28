import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2447_1 {
	
	static char[][] starArr;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		starArr = new char[N][N];
		
		drawStars(0, 0, N, false);
		
		for(int i = 0; i < N; i++) {
			bw.write(starArr[i]);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		
		
	}//main
	
	static void drawStars(int x, int y, int N, boolean isBlank) {
		
		if(isBlank) {
			for(int i = x; i < x + N; i++) {
				for(int j = y; j < y + N; j++) {
					starArr[i][j] = ' ';
				}
			}
			return;
		}
		
		if(N == 1) {
			starArr[x][y] = '*';
			return;
		}
		
		int size = N / 3;
		int cnt = 0;
		
		for(int i = x; i < x + N; i += size) {
			for(int j = y; j < y + N; j += size) {
				cnt++;
				if(cnt == 5) {
					drawStars(i, j, size, true);
				} else {
					drawStars(i, j, size, false);
				}
			}
		}
		
	}
		
}
