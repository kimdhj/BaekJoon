package arrange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main1181 {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] wordArr = new String[N];
		for(int i = 0; i < N; i++) {
			String word = br.readLine();
			wordArr[i] = word;
		}
		
		Arrays.sort(wordArr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {//문자열의 길이가 같은경우
					return o1.compareTo(o2);//사전적 순서대로 오름차순
				} else {//그 외의 경우
					return o1.length() - o2.length();//길이 순서대로 오름차순
				}
			}
		});
		StringBuilder sb = new StringBuilder();
		sb.append(wordArr[0]).append("\n");
		for(int i = 1; i < N; i++) {
			if(!wordArr[i].equals(wordArr[i - 1])) {//입력된 이전문자와 같은지 확인 후 같지않으면 입력
				sb.append(wordArr[i]).append("\n");
			}
		}
		System.out.println(sb);
	}
}