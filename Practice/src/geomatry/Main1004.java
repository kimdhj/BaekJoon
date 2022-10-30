package geomatry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int result = 0;
			int n = Integer.parseInt(br.readLine());
			for(int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				int cx = Integer.parseInt(st.nextToken());
				int cy = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());
				result += check(x1, y1, x2, y2, cx, cy, r);
			}
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}
	
	public static int check(int x1, int y1, int x2, int y2, int cx, int cy, int r) {
		boolean checkStart = false;
		boolean checkEnd = false;
		
		if(Math.pow(cx - x1, 2) + Math.pow(cy - y1, 2) <= Math.pow(r, 2)) checkStart = true;
		if(Math.pow(cx - x2, 2) + Math.pow(cy - y2, 2) <= Math.pow(r, 2)) checkEnd = true;
		
		if(checkStart != checkEnd) return 1;//두 점이 원의 내부, 외부에 있어서 지나가야 하는 경우.
		
		return 0;
	}
}
