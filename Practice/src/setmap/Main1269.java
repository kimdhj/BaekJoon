package setmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();
		Set<Integer> cloneA = new HashSet<>();
		Set<Integer> cloneB = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int aNum = Integer.parseInt(st.nextToken());
			setA.add(aNum);
			cloneA.add(aNum);
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int bNum = Integer.parseInt(st.nextToken());
			setB.add(bNum);
			cloneB.add(bNum);
		}
		
		StringBuilder sb = new StringBuilder();
		setA.removeAll(cloneB);
		setB.removeAll(cloneA);
		sb.append(setA.size() + setB.size());
		System.out.println(sb);
	}
}
