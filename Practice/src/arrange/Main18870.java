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
		
		int[] numArr = new int[N];//�����迭
		int[] tmpArr = new int[N];//�����ϱ����� �ӽù迭(���纻)
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			numArr[i] = num;
			tmpArr[i] = num;
		}
		Arrays.sort(tmpArr);
		Map<Integer, Integer> numMap = new HashMap<>();//key�� : numArr�� �ִ� ����, value : ������ ��ǥ�� (����)
		int rank = 0;//���� ���� ���ڸ� 0���� ������ �ű��
		for(int i = 0; i < tmpArr.length; i++) {
			if(!numMap.containsKey(tmpArr[i])) {//���� Ű���� ���� ������쿡�� numMap�� put���ش�
				numMap.put(tmpArr[i], rank);
				rank++;//��������
			}			
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < numArr.length; i++) {
			sb.append(numMap.get(numArr[i])).append(" ");
		}
		System.out.println(sb);
	}
}
