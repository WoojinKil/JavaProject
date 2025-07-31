package study;

public class StringExam2 {

	public static void main(String[] args) {
		

		String str1 = "hello world";
		String str2 = str1.substring(5);
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		String str3 = str1+str2;
		System.out.println(str3);
		
		
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4);
			
		String str5 = "";
		for(int i=0; i< 100; i++) {
			str5 = str5 + "*";
			
			
		}
		//성능상으로 문제가 있다. 100번 반복되는동안 스트링 버퍼를 100번 생성해야되기 때문에
		//for 문에서 String 을 사용하는 것은 좋지 않다,.
		
		
		System.out.println(str5);
		
		StringBuffer sb1 = new StringBuffer();
		for(int i=0; i< 100; i++) {
			sb1.append("*");
		}
		System.out.println(sb1.toString());
		
		
	}

			
	
}
