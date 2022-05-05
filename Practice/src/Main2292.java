import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2292 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cnt = 1;
		int hive = 1;
		
		while(num > hive) {
			
			hive += cnt * 6;
			cnt++;		
			
		}//while
		System.out.println(cnt);
		
	}
	
}
