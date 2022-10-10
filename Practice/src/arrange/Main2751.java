package arrange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2751 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int numArr[] = new int[N];
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			numArr[i] = num;
		}
		Arrays.sort(numArr);
		for(int i = 0; i < numArr.length; i++) {
			sb.append(numArr[i]).append("\n");
		}
		
		System.out.println(sb);
	}
}
