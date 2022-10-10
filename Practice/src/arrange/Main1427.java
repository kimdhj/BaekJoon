package arrange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main1427 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] _NArr = br.readLine().split("");
		Integer[] NArr = new Integer[_NArr.length];
		
		for(int i = 0; i < NArr.length; i++) {
			NArr[i] = Integer.parseInt(_NArr[i]);
		}
		Arrays.sort(NArr, Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < NArr.length; i++) {
			sb.append(NArr[i]);
		}
		System.out.println(sb);
	}
}
