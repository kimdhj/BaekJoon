import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1152 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char preChar = 32;
		char curChar = '\u0000';
		int cnt = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 32 || str.charAt(i) == 10) {
				preChar = 32;
				continue;
			} else {
				curChar = str.charAt(i);
				if(preChar == 32 && curChar != 32) {
					preChar = '\u0000';
					cnt++;
				}
				
			}//if else
		}//for
		System.out.println(cnt);
				
	}

}
