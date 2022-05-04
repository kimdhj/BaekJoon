import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1316_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			if(isGroup(str)) {
				cnt++;
			}//if
		}//for
		System.out.println(cnt);
	}

	
	public static boolean isGroup(String str) {
		boolean[] numCheck = new boolean[26];
		
		int preChar = -1;
		int curChar = 0;
		
		for(int i = 0; i < str.length(); i++) {
			curChar = str.charAt(i) - 97;
			if(preChar != curChar) { // 이전 문자와 현재문자가 다를경우
				if(!numCheck[curChar]) { // 현재문자가 이미 나왔었는지 확인
					 numCheck[curChar] = true;
					 preChar = curChar;
				} else {
					 return false;
				} // inner if else
			} // outer if
		} // for
		
		return true;
	}
	
}
