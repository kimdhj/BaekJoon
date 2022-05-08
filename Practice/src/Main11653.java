import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Main11653 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i = 2;
		
		LinkedList<Integer> list = new LinkedList<>();
		
		while(n != 1) {
						
			if(n % i == 0) {
				list.add(i);
				n = n / i;
				i = 2;
				
			} else {
				i++;
			}//if else
			
		}//while
		Collections.sort(list);
		for(int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
		
	}//main

}
