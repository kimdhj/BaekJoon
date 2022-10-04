package arrange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2750 {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] numArrPlus = new int[1001];
		int[] numArrMinus = new int[1001];
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num < 0) { //������ ���
				num = -num;
				numArrMinus[num]++;
			} else { //0 �Ǵ� ����� ���
				numArrPlus[num]++;
			}
		}
		
		StringBuilder sb = new StringBuilder();		
		for(int i = 1000; i > 0; i--) { //����
			if(numArrMinus[i] != 0) {
				sb.append(-i).append("\n");
			}
		}
		for(int i = 0; i < 1001; i++) { //���
			if(numArrPlus[i] != 0) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
		
	}

}
