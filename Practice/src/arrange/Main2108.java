package arrange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2108 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // �� �� (Ȧ��)
		
		int sum = 0;
		int avg = 0;
		int center = 0;
		int freqNum = 0;
		int range = 0;
		int numArr[] = new int[8001];
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			numArr[num + 4000]++; //-4000�� ��� 0���� ȯ���ؼ� �迭�� ī��Ʈ���ش�
			sum += num; //�� ��
		}
		//��� ���ϱ�
		avg = Math.round(sum / (float) N); //���
		
		
		//�߰��� ���ϱ�
		int cnt = 0;
		outerFor :
		for(int i = 0; i < 8001; i++) {
			if(cnt < (N + 1)/2 && numArr[i] > 0) { //�߰����� �ε��� <ex. N�� 7�̸� 4��° ��>
				for(int j = 0; j < numArr[i]; j++) { //�ߺ����� ���� �� �����Ƿ� �ѹ� �� �ݺ����ش�.
					cnt++;
					if(cnt == (N + 1)/2) {
						center = i - 4000; //�߰����� ã�� �ݺ��� Ż��
						break outerFor;
					}
				}
			}
		}
		
		//�ֹݰ� ���ϱ�
		cnt = 0;//�ֺ� �ߺ��� ��� �� ��°�� ���� ���� ã�� ���� cnt
		int freq = 0;//�󵵼� �ʱⰪ 0
		for(int i = 0; i < 8001; i++) {
			if(numArr[i] > freq) {//���� �󵵼����� ū ���
				cnt = 0;//ī��Ʈ �ʱ�ȭ
				freq = numArr[i];
				freqNum = i - 4000;
			} else if(numArr[i] == freq) {//���� �󵵼��� ���� ���
				cnt++;//ī��Ʈ ����
				freq = numArr[i];
				if(cnt == 1) {//�󵵼��� ������� �� ��° ���� �ִ´�
					freqNum = i - 4000;
				}
			}
		}
		
		//���� ���ϱ�
		int min = 0;
		int max = 0;
		//�ּҰ� - �տ������� ã���� �� ���� 0�̾ƴ� ù ��° �ε�����
		for(int i = 0; i < 8001; i++) {
			if(numArr[i] > 0) {
				min = i - 4000;
				break;
			}
		}
		
		//�ִ밪 - �ڿ������� ã���� �� ���� 0�̾ƴ� ù ��° �ε��� ��
		for(int i = 8000; i >= 0; i--) {
			if(numArr[i] > 0) {
				max = i - 4000;
				break;
			}
		}
		range = max - min;//����
		
		/*
		 * avg : ���
		 * center : �߰���
		 * freqNum : �ֺ� (�ֺ��� ���� �� ���� ���, �ֺ� �� �� ��°�� ���� ��)
		 * range : ���� (�ִ밪 - �ּҰ�)
		 */
		
		StringBuilder sb = new StringBuilder();
		sb.append(avg).append("\n").append(center).append("\n").append(freqNum).append("\n").append(range);
		System.out.println(sb);
	}
}
