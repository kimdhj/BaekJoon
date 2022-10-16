package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[M];
			for(int j = 0; j < M; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			int check = 0;
			for(int j = 1; j < arr.length - 1; j++) {
				int leftSum = 0;
				int rightSum = 0;
				for(int k = j - 1; k >= 0; k--) {
					leftSum += arr[k];
				}
				for(int k = j + 1; k < arr.length; k++) {
					rightSum += arr[k];
				}
				if(leftSum == rightSum) check++;
			}
			if(check == 1) {
				sb.append("YES").append("\n");
			} else {
				sb.append("NO").append("\n");
			}
		}
		System.out.println(sb);
	}
}
