package cn.nbcc.sms.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import cn.nbcc.sms.utils.DateUtil;

public class CourseSession {
	private String csID;
	private ArrayList<Student> students = new ArrayList<Student>();
	private Date startDate;
	private Course course;
	
	public CourseSession(String csID,Course course, Date startDate) {
		this.csID = csID;
		this.course = course;
		this.startDate = startDate;
	}

	/**
	 * ѧ��ע��
	 * @param student
	 */
	public void enroll(Student student) {
		students.add(student);
	}

	/**
	 * ����ѧ������
	 * @return ѧ�����������Ϊ�շ���0
	 */
	public int getNumberOfStudents() {
		return students.size();
	}

	public List<Student> getAllStudent() {
		return students;
	}

	public Student get(int index) {
		return students.get(index);
	}

	public void setStartDate(Date date) {
		this.startDate = date;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public String getCsID() {
		return csID;
	}

	public void setCsID(String csID) {
		this.csID = csID;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

	public Date getEndDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		calendar.add(Calendar.DAY_OF_YEAR, 7);
		return calendar.getTime();
	}
	
	
}
