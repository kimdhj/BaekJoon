import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main4344 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCaseLine = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < testCaseLine; i ++) {
			int cnt = 0;
			int sum = 0;
			double average = 0;
			double rate = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int stu = Integer.parseInt(st.nextToken());
			
			for(int j = 0; j < stu; j++) {
				int score = Integer.parseInt(st.nextToken());
				sum += score;
				arr.add(score);
			}//inner for			
			average = (double)sum / stu;
			System.out.println("평균 = " + average);	
			
			for(int j = 0; j < stu; j++) {
				if(arr.get(j) > average) {
					cnt++;
				}
			}//inner for
			
			System.out.println("평균보다 높은 학생 수 = " + cnt);
			
			rate = ((double)cnt / stu) * 100;
			System.out.printf("%.3f%%\n", rate);
			arr.clear();
		}//outer for
		br.close();	
	}
}