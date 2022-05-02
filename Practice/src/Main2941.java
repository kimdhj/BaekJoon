import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main2941 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] croStr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i = 0; i < croStr.length; i++) {
			
			if(str.contains(croStr[i])) {
				str = str.replace(croStr[i], "0");
			}//if
			
		}//for
		System.out.println(str.length());
		
	}
	
}