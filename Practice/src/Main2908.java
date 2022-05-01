import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2908 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = st.countTokens();
		int max = 0;
		int[] numArr = new int[2];//변환한 숫자 받을 배열
		
		for(int i = 0; i < cnt; i++) {
			char tmp = '\u0000';
			String str = st.nextToken();
			char[] charArr = str.toCharArray();//받은 문자를 char배열로 변환
			tmp = charArr[0];
			charArr[0] = charArr[2];
			charArr[2] = tmp;
			String newStr = new String(charArr);
			numArr[i] = Integer.parseInt(newStr);
		}
		
		if(numArr[0] > numArr[1]) {
			max = numArr[0];
		} else {
			max = numArr[1];
		}
		System.out.println(max);
	}
	
}
