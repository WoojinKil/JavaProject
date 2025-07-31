package javaUtil.exam;

public class BoxExam {
	public static void main(String[] args) {
//	
//		Box box = new Box();
//		box.setObj(new Object());
//		Object obj = box.getObj();
//		
//		box.setObj("hello");
//		
//		String str = (String)box.getObj();
//		
//		
//		box.setObj(1);
//		int int1 = (int)box.getObj();
//		
//	
		
		
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<String>();
		box2.setObj("hello");
		String str2 = box2.getObj();
		
		Box<Integer> box3 = new Box<Integer>();
		
		box3.setObj(3);
		int val = box3.getObj();
		
	}

}
