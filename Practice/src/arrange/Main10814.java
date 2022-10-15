package arrange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[][] userArr = new String[N][3]; //����, �̸�, ���Լ��� �Է¹��� 2�����迭 ����
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			userArr[i][0] = st.nextToken();
			userArr[i][1] = st.nextToken();
			userArr[i][2] = String.valueOf(i);//�����Ѽ���
		}
		
		Arrays.sort(userArr, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				if(o1[0] == o2[0]) {
					return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
					//return Integer.parseInt(o2[2]) - Integer.parseInt(o1[2]); ���̰� ������� ��������
				} else {
					return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
				}
				
			}
			
		});
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(userArr[i][0] + " " + userArr[i][1]).append("\n");
		}
		System.out.println(sb);
	}
}
