import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11720 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		int sum = 0;
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			sum += Integer.parseInt(str.substring(i, i + 1));
		}
		System.out.println(sum);
		
	}
	
}
