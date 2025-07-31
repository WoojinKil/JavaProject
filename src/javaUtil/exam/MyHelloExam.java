package javaUtil.exam;

import java.lang.reflect.Method;

public class MyHelloExam {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyHello myHello = new MyHello();
		
		//메소드의 정보를 알아내는 객체
		try {
			Method method = myHello.getClass().getDeclaredMethod("sayHello");
			
			//특정 메소드에 해당 어노테이션이 적용되어 있으면?
			if(method.isAnnotationPresent(Count100.class)) {
				for(int i= 0; i<100; i++) {
					myHello.sayHello();
				}
			}else {
				myHello.sayHello();
			}
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("메소드가 존재하지 않습니다");
			e.printStackTrace();
		}
		
		
	}

}
