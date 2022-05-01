import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main1157 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().toUpperCase();
		
		int max = 0;
		char c = '\u0000';
		int[] arr = new int[26];
		
		for(int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 65] += 1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				c = (char)(i + 65);
			} else if(arr[i] == max) {
				c = '?';
			}
				
		}//for
		System.out.println(c);
				
	}//main
	
}