package setmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> nameMap = new HashMap<>();
		Map<Integer, String> numMap = new HashMap<>();
		for(int i = 0; i < N; i++) {
			String poketmon = br.readLine();
			nameMap.put(poketmon, i + 1);
			numMap.put(i + 1, poketmon);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			String question = br.readLine();
			if(question.charAt(0) - 57 > 0) {//포켓몬 이름
				sb.append(nameMap.get(question)).append("\n");
			} else {//포켓몬 번호
				sb.append(numMap.get(Integer.parseInt(question))).append("\n");
			}
		}
		System.out.println(sb);
	}
}
