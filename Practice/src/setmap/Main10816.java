package setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < N; i++) {
			int cardNum = Integer.parseInt(st.nextToken());
			if(map.containsKey(cardNum)) {//ī�� ���� ī����(�̹� �ִ� ī���� ��� ī�尳�� + 1)
				int num = map.get(cardNum) + 1;
				map.put(cardNum, num);
			} else {//ó�� ����ϴ� ī��
				map.put(cardNum, 1);
			}
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		for(int i = 0; i < M; i++) {
			int cardNum = Integer.parseInt(st.nextToken());
			if(map.get(cardNum) == null) {
				bw.write(0 + " ");
			} else {
				bw.write(map.get(cardNum) + " ");
			}
		}
		bw.flush();
		bw.close();
	}
}
