package arrange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] numArr = new int[N];//원본배열
		int[] tmpArr = new int[N];//정렬하기위한 임시배열(복사본)
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			numArr[i] = num;
			tmpArr[i] = num;
		}
		Arrays.sort(tmpArr);
		Map<Integer, Integer> numMap = new HashMap<>();//key값 : numArr에 있는 숫자, value : 압축한 좌표값 (순서)
		int rank = 0;//제일 작은 숫자를 0부터 순서를 매긴다
		for(int i = 0; i < tmpArr.length; i++) {
			if(!numMap.containsKey(tmpArr[i])) {//같은 키값이 들어가지 않은경우에만 numMap에 put해준다
				numMap.put(tmpArr[i], rank);
				rank++;//순서증가
			}			
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < numArr.length; i++) {
			sb.append(numMap.get(numArr[i])).append(" ");
		}
		System.out.println(sb);
	}
}
