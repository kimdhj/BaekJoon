import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1316_2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			if(isGroup(str)) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
	}
	
	
	static boolean isGroup(String str) {
		boolean[] checkArr = new boolean[26];
		
		int preChar = -1;
		
		for(int i = 0; i < str.length(); i++) {
			int curChar = str.charAt(i) - 97;
			if(curChar != preChar) {
				if(!checkArr[curChar]) {
					checkArr[curChar] = true;
					preChar = curChar;
				} else {
					return false;
				}
			}
			
		}
		
		return true;
	}
}
