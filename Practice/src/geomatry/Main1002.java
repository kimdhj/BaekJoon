package geomatry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			sb.append(howFar(st)).append("\n");
		}
		System.out.println(sb);
	}
	
	private static int howFar(StringTokenizer st) {
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		int r1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		int r2 = Integer.parseInt(st.nextToken());
		
		double lengthXY = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		double lengthR1 = Math.pow(r2 - r1, 2);
		double lengthR2 = Math.pow(r2 + r1, 2);
		
		if(lengthXY == 0 && lengthR1 == 0) {//무한대
			return -1;
		} else if(lengthXY < lengthR1 || lengthXY > lengthR2) {//경우의 수 0인경우
			return 0;
		} else if(lengthXY == lengthR1 || lengthXY == lengthR2) {//내접 or 외접 경우의수 1
			return 1;
		} else {
			return 2;
		}
	}
}
