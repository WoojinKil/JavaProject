package javaUtil.exam;

//이번엔 Runnable 인터페이스 구현
public class MyThread2 implements Runnable {

	String str;
	
	public MyThread2(String str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
