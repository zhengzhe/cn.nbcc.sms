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
	
	//TODO:01添加策略变量gradingStrategy，并初始化为普通等级分数策略
	private GradingStrategy gradingStrategy=new RegularGradingStrategy();
	
	
	//TODO:02添加gradingStrategy的setters和getters方法

	public GradingStrategy getGradingStrategy() {
		return gradingStrategy;
	}

	public void setGradingStrategy(GradingStrategy gradingStrategy) {
		this.gradingStrategy = gradingStrategy;
	}


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
			//TODO:03使用策略接口的相应方法来获取分数
			points += gradingStrategy.getGradePointsFor(grade);
		}
		return points /grades.size();
	}
}

