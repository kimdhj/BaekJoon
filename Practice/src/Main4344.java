import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main4344 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			int cnt = 0;
			double rate = 0;
			double average = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());

			for(int j = 0; j < a; j++) {
				int b = Integer.parseInt(st.nextToken());
				arr.add(b);
				sum += b;
				
			}//inner for
			average = (double)sum / a;

			for(int j = 0; j < a; j++) {
				if(arr.get(j) > average) {
					cnt++; //lower score student num check
				}
			}//inner for 
			rate = ((double)cnt / a) * 100;
			System.out.printf("%.3f%%\n", rate);
			
			arr.clear();
		}//outer for
		
	}
	
}
