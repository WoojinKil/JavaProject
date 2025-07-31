package javaUtil.exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

	public static void main(String[] args) {
		LocalDateTime timePonint = LocalDateTime.now();
		System.out.println(timePonint);
		
		
		LocalDate ldate1 = LocalDate.of(2021, Month.JANUARY, 1);
		System.out.println(ldate1);
		
		LocalTime lt1 = LocalTime.of(17, 18);
		System.out.println(lt1);
		LocalTime lt2 = LocalTime.parse("10:14:30");
		System.out.println(lt2);
	}
}
