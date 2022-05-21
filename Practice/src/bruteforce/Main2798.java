package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main2798 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		 st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> numList = new ArrayList<>();
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			numList.add(num);			
		}
		
		System.out.println(maxNum(numList, M));
		
		
		
		
			
	}
	
	static int maxNum(ArrayList<Integer> numList, int M) {
		int max = 0;
		int sum = 0;
		
		for(int i = 0; i < numList.size() - 2; i++) {
			for(int j = i + 1; j < numList.size() - 1; j++) {
				for(int k = j + 1; k < numList.size(); k++) {
					
					sum = numList.get(i) + numList.get(j) + numList.get(k);
					if(sum <= M && sum > max) {
						max = sum;
					}				
					
				}//inner inner for
			}//inner for
		}//for
		
		return max;
	}
	

}
