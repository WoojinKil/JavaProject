package javaUtil.exam;

public class Box<T> {
	private T obj;
	
	
	public T getObj() {
		return obj;
	}


	// 후손몬 String 클래스 등 모든 객체들이 들어간다
	public void setObj(T obj) {
		this.obj = obj;
	}


}
