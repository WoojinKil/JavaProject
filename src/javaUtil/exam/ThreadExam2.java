package javaUtil.exam;

public class ThreadExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread2 t1 = new MyThread2("*");
		MyThread2 t2 = new MyThread2("-");
		
		//start메소드가 없음
		//실제 스레드를 만들어야함
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("main end!!");
				
	}

}
