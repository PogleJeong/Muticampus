package calendar;
import java.util.Calendar;

public class CalendaClass {
	public static void main(String[] args) {
		
		calendarPrint(2023,1);
	}
	static void calendarPrint(int year, int month) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); //MONTH 는 0-11
		
		int startDay = cal.get(Calendar.DAY_OF_WEEK); // 시작하는날의 요일
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) +1 ;
		
		String weekdaysName = "일월화수목금토";
		System.out.println(year + "년 " + month + "월");
		System.out.println("=".repeat(50));
		
		for (int i=0; i<weekdaysName.length(); i++) {
			System.out.printf("%s\t",weekdaysName.charAt(i));
		}
		System.out.println("\n"+"=".repeat(50)); 
		
		// 위쪽빈칸
		for(int i = 1;i < startDay; i++) {
			System.out.print("*" + "\t");
		}
		// 날짜
		int _day = 1;
		for(int i = 0; i < lastDay; i++) {
			System.out.print(_day + "\t");
			
			if((_day + startDay - 1) % 7 == 0) {
				System.out.println();
			}			
			_day++;
		}
		
		// 밑쪽 빈칸
		for(int i = 0;i < (7 - (startDay + lastDay - 1) % 7); i++) {
			System.out.print("*" + "\t");
		}
		System.out.println();
		
		System.out.println("=".repeat(50));	
	}
}
