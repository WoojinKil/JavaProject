package study;

import java.util.Objects;

public class Student {
	String name;
	String number;
	int birthYear;
	
	
	




	@Override
	public int hashCode() {
		return Objects.hash(number);
	}







	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(number, other.number);
	}







	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "hong";
		s1.number = "1234";
		s1.birthYear = 1995;
		
		Student s2 = new Student();
		s2.name = "hong";
		s2.number = "1234";
		s2.birthYear = 1995;
		
		if(s1.equals(s2)) {
			System.out.println("true");
		}else{
			System.out.println("fall");
		}
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}
