package study;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DateTest {

	@Test
	public void date() throws Exception {
		Date now = new Date();
		System.out.println("현재 : " + now);
		System.out.println("현재 밀리초 : " + now.getTime());

		Date date = new Date(117, 8,16);
		System.out.println("2013-01-23 : " + date);
		System.out.println(date.getTime());

		date = new Date(2013, 1, 22, 11, 23, 33);
		System.out.println("2013-01-23 11:23:33 : " + date);
	}
}
