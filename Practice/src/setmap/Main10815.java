package setmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class Main10815 {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st;
		 
		 int N = Integer.parseInt(br.readLine());
		 st = new StringTokenizer(br.readLine());
		 Map<Integer, Integer> cardMap = new HashMap<>();
		 for(int i = 0; i < N; i++) {
			 int num = Integer.parseInt(st.nextToken());
			 cardMap.put(num, 1);//가지고있는 숫자(key값), 1(value값)
		 }
		 
		 int M = Integer.parseInt(br.readLine());
		 st = new StringTokenizer(br.readLine());
		 StringBuilder sb = new StringBuilder();
		 for(int i = 0; i < M; i++) {
			 int num = Integer.parseInt(st.nextToken());
			 if(cardMap.containsKey(num)) {//상근이가 가지고있는 숫자인 경우
				 sb.append(cardMap.get(num)).append(" ");
			 } else {
				 sb.append(0 + " ");
			 }
		 }
		 System.out.println(sb);
	}
}
