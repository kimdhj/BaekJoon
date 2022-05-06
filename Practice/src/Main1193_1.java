import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1193_1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		int line = 0;
		int curSum = 0; // 현재라인 까지의 총 개수
		int preSum = 0; // 직전라인 까지의 총 개수
		int mother = 0; // 분모
		int son = 0; // 분자
		
		while(x > curSum) {
			
			line++;
			curSum += line; 
			preSum += (line - 1); 
			
		}//while
		StringBuilder sb = new StringBuilder();
		if(line % 2 == 0) { // 짝수라인일 경우
			son = x - preSum;
			mother = (line + 1) - son;
		} else { // 홀수라인일 경우
			mother = x - preSum;
			son = (line + 1) - mother;
		}
		sb.append(son).append("/").append(mother);
		System.out.println(sb);
		
	}//main

}
