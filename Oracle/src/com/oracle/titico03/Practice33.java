package com.oracle.titico03;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Practice33 {
	public  static void main(String[] args) {
		
	LocalDate today = LocalDate.now();	
		
	System.out.println(today.plusYears(1).getDayOfWeek());
		
	LocalTime teaTime = LocalTime.of(17, 30);
	System.out.println(teaTime);
	
	Duration timeGap = Duration.between(LocalTime.now(), teaTime);
	System.out.println(timeGap);
	
	System.out.println(timeGap.toMinutes());
	System.out.println(timeGap.toHours());
	System.out.println(timeGap.toMinutesPart());
	
	LocalDateTime tomorrowTeaTime = LocalDateTime.of(today.plusDays(1), teaTime);
	System.out.println(tomorrowTeaTime);
	
	ZoneId london = ZoneId.of("Europe/London");
	ZoneId katmandu = ZoneId.of("Asia/Katmandu");
	
	ZonedDateTime londonTime = ZonedDateTime.of(tomorrowTeaTime, london);
	System.out.println(londonTime);
	
	Locale locale = Locale.FRANCE;
	
	ZonedDateTime katmanduTime = londonTime.withZoneSameInstant(katmandu);
	System.out.println(katmanduTime);
	
	System.out.println(katmanduTime.getOffset());
	
	String datePattern = "EE', 'd' of 'MMMM yyyy' at 'HH:mm z";
	
	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(datePattern, locale);
	String timeTxt = dateFormat.format(katmanduTime);
	
	System.out.println(timeTxt);
	
	
	
	
	
	
	
	
	
		
	}
}
