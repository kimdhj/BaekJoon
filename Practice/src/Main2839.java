import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2839 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int num = -1;
		int loop = N / 5; // 입력된 숫자에서 0 부터 5를 몇번 더할 수 있는지 체크
		
		for(int i = 0; i <= loop; i++) {
			
			if((N - (5 * i)) % 3 == 0) { // 5kg 주머니의 개수를 0개부터 loop개 까지 늘려가며 정확하게 떨어지는 봉지 개수 체크 루틴
				num = i + (N - (5 * i)) / 3;
			}//if

		}//for
		System.out.println(num);
	}//main

}
