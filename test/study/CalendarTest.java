package study;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class CalendarTest {

	@Test
	public void endDate() throws Exception {
		Calendar date = Calendar.getInstance();
		date.set(2017, Calendar.JULY, 31);
		date.add(Calendar.DAY_OF_YEAR, 6 * 7 - 3);
		printDate("강의 종료 날짜: ", date);
	}

	@Test
	public void calendar() throws Exception {
		Calendar now = Calendar.getInstance();
		System.out.println("현재 : " + now.getTime());
		System.out.println("현재 밀리초 : " + now.getTimeInMillis());

		now.set(2017, 7, 31);
		System.out.println("2017-07-31 : " + now.getTime());

		now.set(2017, 7, 31, 11, 23, 33);
		System.out.println("2017-07-31 : " + now.getTime());
	}

	@Test
	public void calendar2() throws Exception {
		Calendar date = Calendar.getInstance();
		date.set(2017, 7, 31);
		printDate("현재 시간 : ", date);

		date.add(Calendar.WEEK_OF_YEAR, -1);
		printDate("1주일 전 : ", date);

		date.add(Calendar.DAY_OF_YEAR, 1);
		printDate("1일 후 : ", date);

		date.add(Calendar.MONTH, -6);
		printDate("6개월 전 : ", date);

		date.roll(Calendar.YEAR, -1);
		printDate("1년 전 : ", date);
	}

	private void printDate(String message, Calendar date) {
		System.out.println(message + toString(date));
	}

	private String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일";
	}
}
