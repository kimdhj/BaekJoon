class Main4673 {
	public static void main(String[] args) {
		
		boolean[] numCheck = new boolean[10001];
		
		for(int i = 1; i < numCheck.length; i++) {
			int otherNum = d(i);
			if(otherNum < 10001) {
				numCheck[otherNum] = true;
			}
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < numCheck.length; i++) {
			if(numCheck[i] == false) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	static int d(int i) {
		int otherNum = i;
		
		while(i != 0) {
			otherNum += (i % 10);
			i = (i / 10);
		}
		return otherNum;
	}
	
}