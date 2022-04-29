import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10809 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(char c = 'a'; c <= 'z'; c++) {
			if(s.contains(String.valueOf(c))) {
				sb.append(s.indexOf(c)).append(" ");
			} else {
				sb.append(-1).append(" ");
			}//if else
		}//for
		System.out.println(sb);
		
	}

}
