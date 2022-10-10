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
			gradeArr[Integer.parseInt(st.nextToken())]++; //�ش����� �迭index ++ (index�� �����̸� �ش� index�� ���� �ش������� �л� ��)
		}
		
		int cnt = 0;
		outerFor : 
		for(int i = 10000; i >= 0; i--) { //���� �������� �Ųٷ� ã�ƾ���
			if(cnt < k) {
				for(int j = 0; j < gradeArr[i]; j++) { //�ߺ������� �л��� ���� ���
					cnt++;
					if(cnt == k) { //cnt�� k���ΰ���� ����(index)�� ��� �ݺ����� ���´�.
						System.out.println(i);
						break outerFor;
					}
				}
			}
		}
	}
}
