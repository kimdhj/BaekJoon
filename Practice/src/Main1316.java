import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main1316 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int groupCnt = 0;//입력받은 문자열중 그룹문자 개수
		
		for(int i = 0; i < n; i++) {
			
			String str = br.readLine();
			boolean chk = isGroup(str);
			if(chk) {
				groupCnt++;
			}
			
		}
		System.out.println(groupCnt);
		
		
				
		
		
		
	}//main
	
	static boolean isGroup(String str) {
		
		Set<String> set = new HashSet<>(Arrays.asList(str.split("")));
		
		//set.size()보다 cnt가 크면 그룹아이디가 아니다
		int cnt = 0; //이전문자와 현재문자가 다르면 cnt++ (그룹문자일경우 (cnt == set.size()) = true) 
		int preChar = -1;
		for(int i = 0; i < str.length(); i++) {
			int curChar = str.charAt(i) - 97;
			if(curChar != preChar) {
				cnt++;
				preChar = curChar;
			}
		}
				
		if(cnt > set.size()) {
			return false; // 그룹아이디가 아니면 false 반환
		} else {
			return true; // 그룹아이디이면 true 반환
		}

	}

}
