import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2839_1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int num = -1; // 조합 불가능할 때의 초기값 -1로 설정
		int loop = N / 5; // 반복문 최대 회전수
		
		//5kg주머니를 하나씩 줄여가며 3kg주머니와 나누어 떨어지는 시점 체크
		for(int i = loop; i >= 0; i--) {
		
			if((N - (5 * i)) % 3 == 0) { // 5kg 봉지가 많을수록 총 개수가 적으므로 역순으로 체크
				num = i + ((N - (5 * i)) / 3);
				break;
			}
			
		}//for
		System.out.println(num);
	}//main

}
