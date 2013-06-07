package cn.nbcc.sms.entities;

import java.util.ArrayList;

/**
 * @author  zhengzhe
 * @2013-5-7
 */


public class Student {
	
	enum Grade{A,B,C,D,F};
	
	String id;
	String name;
	//获得的现有学分
	int credits;
	

	boolean isHornor;
	boolean isGuest;
	public boolean isGuest() {
		return isGuest;
	}

	public void setGuest(boolean isGuest) {
		this.isGuest = isGuest;
	}

	public boolean isHornor() {
		return isHornor;
	}

	public void setHornor(boolean isHornor) {
		this.isHornor = isHornor;
	}


	private ArrayList<Grade> grades = new ArrayList<Student.Grade>();
	
	
	public void addGrade(Grade aGrade){
		grades.add(aGrade);
	}
	
	public Student(String id,String name) {
		this.id = id;
		this.name = name;
	}
	public Student(String name) {
		this("Unknown",name);
	}
	public Student() {
		this("Unknown","Unknown");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}

	
	/**
	 * 获得平均成绩
	 * @return 返回平均成绩
	 */
	public double getGpa() {
		if (grades.isEmpty()) {
			return 0;
		}
		double points = 0;
		for (Grade grade : grades) {
			points = gradePointsFor(grade);
		}
		if(isHornor)
			points+=1;
		return points /grades.size();
	}

	private double gradePointsFor(Grade grade) {
		switch (grade) {
		case A:
			return 4;
		case B:
			return 3;
		case C:
			return 2;
		case D:
			return 1;
		default:
			return 0;
		}
	}
	
}

