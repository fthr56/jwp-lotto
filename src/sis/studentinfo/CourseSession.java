package sis.studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class CourseSession {

	private String department;
	private String number;
	private int numberOfStudents;
	private ArrayList<Student> students;
	private Date startDate;
	private Date endDate;
	private Calendar calendar = Calendar.getInstance();
	
	CourseSession(String department, String number) {
		this.department = department;
		this.number = number;
		this.numberOfStudents = 0;
		this.students = new ArrayList<>();
	}
	
	public CourseSession(String department, String number, Date startDate) {
		this.department = department;
		this.number = number;
		this.numberOfStudents = 0;
		this.students = new ArrayList<>();
		this.startDate = startDate;
		this.endDate = setEndDate();
		}
	
	private Date setEndDate() {
		calendar.setTime(startDate);
		calendar.add(Calendar.WEEK_OF_YEAR, 1);
		return calendar.getTime();
	}

	public void enroll(Student student) {
		students.add(student);
		numberOfStudents++;
	}

	public Student findStudent(int index) {
		return students.get(index);
	}
	
	public void drop(Student student) {
		students.remove(student);
	}
	
	public String getDepartment() {
		return department;
	}

	public String getNumber() {
		return number;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public Object getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

}
