import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Main3052 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < 10; i ++) {
			int a = Integer.parseInt(br.readLine());
			arr.add(a % 42);
		}//for
		
		Set<Integer> set = new HashSet<>(arr);
		System.out.println(set.size());
				
	}
	
}