package javaUtil.exam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalenderExam {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println(ft.format(date));
		System.out.println(date.getTime());
	
		long todat =System.currentTimeMillis();
		System.out.println(todat);
		
		System.out.println(todat - date.getTime());
		
	}
}
