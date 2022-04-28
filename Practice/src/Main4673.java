import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Main4673 {

	static void selfNum() {
		
		ArrayList<Integer> selfNumArr = new ArrayList<>();
		ArrayList<Integer> otherNumArr = new ArrayList<>();
	
		for(int i = 1; i <= 10000; i++) {
			selfNumArr.add(i); // selfNumArr에 1부터 10000까지의 수 저장
		}
		
		for(int num = 1; num <= 10000; num++) {
						
			int otherNum = 0;
			int eachDigitSum = 0;
			
			String[] str = String.valueOf(num).split(""); // i의 각 자리수를 문자열 배열에 저장
			int iLength = str.length; // i의 각 자리수 만큼 더하는 for반복문 반복횟수
			
			for(int j = 0; j < iLength; j++) {
				eachDigitSum += Integer.parseInt(str[j]); // 각 자리수의 합
			}
			otherNum = num + eachDigitSum;
			otherNumArr.add(otherNum);
		}
		
		HashSet<Integer> otherNumSet = new HashSet<>(otherNumArr); // otherNumArr 중복값 제거
		otherNumArr = new ArrayList<>(otherNumSet); // 다시 리스트로 변환
		
		Collections.sort(otherNumArr); // 내가 보기편하려고 정렬(오름차순)
		for(int i = 0; i < otherNumArr.size(); i++) {
			if(selfNumArr.contains(otherNumArr.get(i))) { // selfNum만 남기고 제거
				selfNumArr.remove(otherNumArr.get(i));
			}
		}
		
		for(int i = 0; i < selfNumArr.size(); i++) { // selfNumArr 출력
			System.out.println(selfNumArr.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		selfNum();
	}
	
}