import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2908 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] numCheckArr = new int[2];
		int max = 0;
		for(int i = 0; i < numCheckArr.length; i++) {
			int num = Integer.parseInt(st.nextToken());
			int sangSuNum = (num % 10) * 100 + ((num % 100) - (num % 10)) + (num / 100);
			numCheckArr[i] = sangSuNum;
		}
		if(numCheckArr[0] > numCheckArr[1]) {
			max = numCheckArr[0];
		} else {
			max = numCheckArr[1];
		}
		System.out.println(max);
		br.close();
	}
	
}