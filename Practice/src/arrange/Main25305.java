package arrange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main25305 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] gradeArr = new int[10001];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			gradeArr[Integer.parseInt(st.nextToken())]++; //해당점수 배열index ++ (index가 점수이며 해당 index의 값이 해당점수의 학생 수)
		}
		
		int cnt = 0;
		outerFor : 
		for(int i = 10000; i >= 0; i--) { //높은 점수부터 거꾸로 찾아야함
			if(cnt < k) {
				for(int j = 0; j < gradeArr[i]; j++) { //중복점수인 학생이 있을 경우
					cnt++;
					if(cnt == k) { //cnt가 k명인경우의 점수(index)를 찍고 반복문을 나온다.
						System.out.println(i);
						break outerFor;
					}
				}
			}
		}
	}
}
