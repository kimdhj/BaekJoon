import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1193 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int sum = 0;
		int sum2 = 0;
		
		int i = 0;
		int mother = 0;
		int son = 0;
		
		while(x > sum) {
			sum2 += i; // 구하고자 하는 줄 이전의 줄까지의 합 (분모 분자 구하기 위함)
			
			i++; // i 번째 줄 체크
			sum += i; // 해당 줄까지 몇개의 숫자가 있는지 체크	
			
		}
		
		if(i % 2 == 0) {
			son = x - sum2;
			mother = i + 1 - son;
		} else {
			mother = x - sum2;
			son = i + 1 - mother;
		}
		
		System.out.println(son + "/" + mother);
		
		
		
	}//main

}
