package dynamic_beat_5;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {

	private Player player;
	private boolean isLoop;
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	
	public  Music(String name, boolean isLoop) {
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}//isLoop()
	public int getTime() {
		if(player == null) return 0;
		return player.getPosition();
	}
	
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt();//해당 스레드를 중지상태로 만든다.(곡을 종료한다)
	}
	
	@Override
	public void run() {//스레드를 사용하면 무조건 사용해야 하는 함수.
		
		try {
			do {
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			} while(isLoop);//isLoop == true 이면 무한 반복재생
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
