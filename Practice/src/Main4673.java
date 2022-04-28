class Main4673 {
	public static void main(String[] args) {
		
		boolean[] checkNum = new boolean[10001];
		
		for(int i = 0; i < checkNum.length; i++) {
			int otherNum = d(i);
			if(otherNum < 10001) {
				checkNum[otherNum] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < checkNum.length; i++) {
			if(checkNum[i] == false) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	static int d(int i) {
		int otherNum = i;
		
		while(true) {
			otherNum += (i % 10);
			i = i / 10;
			if(i == 0) break;
		}
		return otherNum;
	}
}