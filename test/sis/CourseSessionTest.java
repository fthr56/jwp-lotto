package sis;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import sis.studentinfo.CourseSession;

public class CourseSessionTest {
	private CourseSession session;
	private Date startDate;

	@Before
	public void setup() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2017, 7, 16);
		startDate = calendar.getTime();
		session = new CourseSession("ENGL", "101", startDate);
	}

	@Test
	public void create() throws Exception {
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(startDate, session.getStartDate());
		assertEquals(0, session.getNumberOfStudents());

		Date endDate = session.getEndDate();
		assertEquals("2017-08-23", convertDateToString(endDate));
	}

	private String convertDateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}

}