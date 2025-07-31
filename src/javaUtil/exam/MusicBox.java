package javaUtil.exam;

public class MusicBox {

	public void palyMusizA() {
		for(int i=0; i< 10; i++) {
			System.out.println("신나능 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void palyMusizB() {
		for(int i=0; i< 10; i++) {
			System.out.println("슬픈 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void palyMusizC() {
		for(int i=0; i< 10; i++) {
			System.out.println("카페 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
