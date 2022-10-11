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
				if(o1.length() == o2.length()) {//���ڿ��� ���̰� �������
					return o1.compareTo(o2);//������ ������� ��������
				} else {//�� ���� ���
					return o1.length() - o2.length();//���� ������� ��������
				}
			}
		});
		StringBuilder sb = new StringBuilder();
		sb.append(wordArr[0]).append("\n");
		for(int i = 1; i < N; i++) {
			if(!wordArr[i].equals(wordArr[i - 1])) {//�Էµ� �������ڿ� ������ Ȯ�� �� ���������� �Է�
				sb.append(wordArr[i]).append("\n");
			}
		}
		System.out.println(sb);
	}
}