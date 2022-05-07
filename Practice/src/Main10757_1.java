import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10757_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		int arrLength = 0;
		int subtractLength = 0;
		
		if(A.length() > B.length()) { // 두 입력값중에 더 긴 값 찾기
			arrLength = A.length();
		} else {
			arrLength = B.length();
		}
		
		String[] strA = new String[arrLength];
		String[] strB = new String[arrLength];
//		System.out.println(strA.length);
//		System.out.println(strB.length);
		
		StringBuilder sb = new StringBuilder();
		sb.append(A);		
		sb.reverse();
		
		subtractLength = arrLength - sb.length();
		for(int i = 0; i < subtractLength; i++) {
			sb.append(0);
		}
			
		strA = String.valueOf(sb).split("");
		sb.delete(0, sb.length());
		
		sb.append(B);
		sb.reverse();
		
		subtractLength = arrLength - sb.length();
		for(int i = 0; i < subtractLength; i++) {
			sb.append(0);
		}
		
		strB = String.valueOf(sb).split("");
		sb.delete(0, sb.length());
		
		
//		System.out.println(Arrays.toString(strA));
//		System.out.println(Arrays.toString(strB));
//		System.out.println(strA.length);
//		System.out.println(strB.length);
		
		int carry = 0;
		
		for(int i = 0; i < arrLength; i++) {
			if(Integer.parseInt(strA[i]) + Integer.parseInt(strB[i]) + carry >= 10) {
				sb.append((Integer.parseInt(strA[i]) + Integer.parseInt(strB[i]) + carry) % 10);
				carry = 1;
			} else {
				sb.append((Integer.parseInt(strA[i]) + Integer.parseInt(strB[i]) + carry));
				carry = 0;
			}//if else
		}//for
		
		if(carry == 1) {
			sb.append(1);
		}
		
		sb.reverse();
		System.out.println(sb);
		
	}

}
