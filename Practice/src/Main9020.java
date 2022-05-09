import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main9020 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			
			int n = Integer.parseInt(br.readLine());
			ArrayList<Integer> primeNumList = isPrime(n);
			int a = 0; // 첫 번째 소수
			int b = 0; // 두 번째 소수
			int aCheck = 0;
			int bCheck = 0;
						
			for(int j = 0; j < primeNumList.size(); j++) {
				if(primeNumList.contains(n - primeNumList.get(j))) {
					aCheck = primeNumList.get(j);
					bCheck = n - aCheck;
					if(aCheck <= bCheck) {
						a = aCheck;
						b = bCheck;
					}
				}//outer if
			}//inner for
			sb.append(a).append(" ").append(b).append("\n");
		}//outer for
		
		System.out.println(sb);
		
		
	}//main
	
	static ArrayList<Integer> isPrime(int n) {
		
		boolean[] primeNumArr = new boolean[n + 1];
		primeNumArr[0] = true;
		primeNumArr[1] = true;
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 2; i < Math.sqrt(n); i++) {
			for(int j = i * i; j < primeNumArr.length; j += i) {
				if(primeNumArr[j]) continue;
				primeNumArr[j] = true;
			}
		}
		
		for(int i = 2; i < primeNumArr.length; i++) {
			if(!primeNumArr[i]) {
				list.add(i);
			}
		}
		
		return list;
	}//isPrime
	
}
