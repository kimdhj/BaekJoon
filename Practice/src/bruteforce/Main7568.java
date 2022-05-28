package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main7568 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] body = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int weight = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			body[i][0] = weight;
			body[i][1] = height;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			int rank = 1;
			for(int j = 0; j < N; j++) {
				if(i == j) continue;
				if(body[i][0] < body[j][0] && body[i][1] < body[j][1]) {
					rank++;
				}//if
			}//inner for
			sb.append(rank).append(" ");
		}//outer for
		System.out.println(sb);
	}//main

}
