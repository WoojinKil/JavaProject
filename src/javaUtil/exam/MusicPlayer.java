package javaUtil.exam;

public class MusicPlayer extends Thread{

	int type;
	MusicBox mb;
	public MusicPlayer(int type, MusicBox mb) {
		super();
		this.type = type;
		this.mb = mb;
	}
	@Override
	public void run() {
		switch (type) {
		
		case 1:
			mb.palyMusizA();
			break;
		case 2 :
			mb.palyMusizB();
		case 3 :
			mb.palyMusizC();
		default:
			break;
		}
	}
	
	
	
}
