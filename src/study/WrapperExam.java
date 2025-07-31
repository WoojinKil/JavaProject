package study;

public class WrapperExam {
	
	public static void main(String[] args) {
		int i=5;
		Integer i2 = new Integer(5);
		
		
		Integer i3 = 5; //new Integer(5);
		//오토박싱
		//자바 이상 버전으로 가능
		//기본 타입 데이터를 객체 타입의 데이터로 자동 형변환 시켜주는 기능
		
		int i4 = i3.intValue();
		
		int i5 = i3;
		//오토 언박싱
		//오토박싱의 반대
		//객체 데이터를 기본 데이터로 자동 형변환 해줌
		
		//오토박싱
		//기본->객체
		//오토언박싱
		//객체->기본
		//자바 버전이 높아질수로 편해짐
		
		
	}

}
