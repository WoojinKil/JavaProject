package javaUtil.exam;

public class ThreadExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		//start를 해야지만 실행 가능
		t1.start();
		t2.start();
		System.out.println("main end!!!!");
		
	}

}
