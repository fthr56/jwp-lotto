package sis.report;

import sis.studentinfo.CourseSession;

public class RosterReporter {
	public static final String NEWLINE = System.getProperty("line.separator");
	public static final String ROSTER_REPORT_HEADER = "학생 목록" + NEWLINE + "----" + NEWLINE;
	public static final String ROSTER_REPORT_FOOTER = NEWLINE + "학생 수 : ";
	private String report;
	private CourseSession session;

	public RosterReporter(CourseSession session) {
		this.session = session;
		this.report = createReport();
	}

	private String createReport() {
		StringBuilder rosterReport = new StringBuilder();
		rosterReport.append(ROSTER_REPORT_HEADER);
		for(int i =0; i< session.getNumberOfStudents(); i++) {
			rosterReport.append(session.findStudent(i).getName());
			rosterReport.append(NEWLINE);
		}
		rosterReport.append(ROSTER_REPORT_FOOTER);
		rosterReport.append(session.getNumberOfStudents());
		return rosterReport.toString();
	}
	
	public String getReport() {
		return report;
	}
}
