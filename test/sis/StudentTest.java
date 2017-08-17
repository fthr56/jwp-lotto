package sis;

import static org.junit.Assert.*;

import org.junit.Test;

import sis.studentinfo.Student;

public class StudentTest {

	@Test
	public void test() {
		Student student = new Student("학선");
		assertEquals("학선", student.getName());

		Student student2 = new Student("승환");
		String studentName2 = student2.getName();
		assertEquals("승환", studentName2);
	}

}
