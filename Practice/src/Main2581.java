import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main2581 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> primeNumList = new ArrayList<>();
		int primeNumSum = 0;
		int primeNumCheck = 0;
		
		for(int i = M; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					primeNumCheck++;
				}
			}//inner for
			if(primeNumCheck == 2) {
				primeNumList.add(i);
			}
			primeNumCheck = 0; // 초기화
		}//for
		
		if(primeNumList.size() > 0) {
			for(int i = 0; i < primeNumList.size(); i++) {
				primeNumSum += primeNumList.get(i);
			}//for
			System.out.println(primeNumSum);
			System.out.println(Collections.min(primeNumList));
		} else {
			System.out.println(-1);
		}//if else
		
		
		
	}//main

}
