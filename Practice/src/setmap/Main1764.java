package setmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Set<String> nSet = new HashSet<>();
		Set<String> mSet = new HashSet<>();
		for(int i = 0; i < N; i++) {//�赵 ���� ���
			nSet.add(br.readLine());
		}
		for(int i = 0; i < M; i++) {//���� ���� ���
			mSet.add(br.readLine());
		}
		nSet.retainAll(mSet);//������
		List<String> list = new ArrayList<>();//���� �������� �����ϱ����� Iterator�� List�� ����
		Iterator<String> iter = nSet.iterator();
		while(iter.hasNext()) {
			list.add(iter.next());
		}
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		sb.append(list.size()).append("\n");
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb);
	}
}
