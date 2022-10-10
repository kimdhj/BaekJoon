package arrange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main11650 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] coordinateArr = new int[N][2];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			coordinateArr[i][0] = x;
			coordinateArr[i][1] = y;
		}
		
		Arrays.sort(coordinateArr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});
		
//		Arrays.sort(coordinateArr, (o1, o2) -> { //¶÷´Ù½Ä
//			if(o1[0] == o2[0]) {
//				return o1[1] - o2[1];
//			}				
//			else {
//				return o1[0] - o2[0];
//			}
//		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(coordinateArr[i][0] + " " + coordinateArr[i][1]).append("\n");
		}
		System.out.println(sb);
	}
}
