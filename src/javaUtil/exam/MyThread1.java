package javaUtil.exam;

public class MyThread1 extends Thread {

	String str;
	
	
	public MyThread1(String str) {
		super();
		this.str = str;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i< 10; i++) {
			System.out.println(str);
			try {
				Thread.sleep((int) (Math.random() *1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
