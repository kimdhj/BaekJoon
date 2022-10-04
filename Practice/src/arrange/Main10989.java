package arrange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main10989 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] numArr = new int[N]; //int�迭�� N��ŭ �޴´�

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			numArr[i] = num;

		}
		Arrays.sort(numArr); //�������� ����
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numArr.length; i++) {
			sb.append(numArr[i]).append("\n");
		}
		System.out.println(sb);
	}
}