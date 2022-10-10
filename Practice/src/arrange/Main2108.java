package arrange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2108 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 줄 수 (홀수)
		
		int sum = 0;
		int avg = 0;
		int center = 0;
		int freqNum = 0;
		int range = 0;
		int numArr[] = new int[8001];
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			numArr[num + 4000]++; //-4000의 경우 0으로 환산해서 배열에 카운트해준다
			sum += num; //총 합
		}
		//평균 구하기
		avg = Math.round(sum / (float) N); //평균
		
		
		//중간값 구하기
		int cnt = 0;
		outerFor :
		for(int i = 0; i < 8001; i++) {
			if(cnt < (N + 1)/2 && numArr[i] > 0) { //중간값의 인덱스 <ex. N이 7이면 4번째 수>
				for(int j = 0; j < numArr[i]; j++) { //중복값이 있을 수 있으므로 한번 더 반복해준다.
					cnt++;
					if(cnt == (N + 1)/2) {
						center = i - 4000; //중간값을 찾고 반복문 탈출
						break outerFor;
					}
				}
			}
		}
		
		//최반값 구하기
		cnt = 0;//최빈값 중복의 경우 두 번째로 작은 값을 찾기 위한 cnt
		int freq = 0;//빈도수 초기값 0
		for(int i = 0; i < 8001; i++) {
			if(numArr[i] > freq) {//이전 빈도수보다 큰 경우
				cnt = 0;//카운트 초기화
				freq = numArr[i];
				freqNum = i - 4000;
			} else if(numArr[i] == freq) {//이전 빈도수와 같은 경우
				cnt++;//카운트 증가
				freq = numArr[i];
				if(cnt == 1) {//빈도수가 같은경우 두 번째 값을 넣는다
					freqNum = i - 4000;
				}
			}
		}
		
		//범위 구하기
		int min = 0;
		int max = 0;
		//최소값 - 앞에서부터 찾았을 때 값이 0이아닌 첫 번째 인덱스값
		for(int i = 0; i < 8001; i++) {
			if(numArr[i] > 0) {
				min = i - 4000;
				break;
			}
		}
		
		//최대값 - 뒤에서부터 찾았을 때 값이 0이아닌 첫 번째 인덱스 값
		for(int i = 8000; i >= 0; i--) {
			if(numArr[i] > 0) {
				max = i - 4000;
				break;
			}
		}
		range = max - min;//범위
		
		/*
		 * avg : 평균
		 * center : 중간값
		 * freqNum : 최빈값 (최빈값이 여러 개 있을 경우, 최빈값 중 두 번째로 작은 값)
		 * range : 범위 (최대값 - 최소값)
		 */
		
		StringBuilder sb = new StringBuilder();
		sb.append(avg).append("\n").append(center).append("\n").append(freqNum).append("\n").append(range);
		System.out.println(sb);
	}
}
