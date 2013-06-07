package cn.nbcc.sms.entities;

import java.util.ArrayList;

/**
 * @author  zhengzhe
 * @2013-5-7
 */


public class Student {
	
	public enum Grade {
		A(5), B(4), C(3), D(2), F(0);
		private int point;

		private Grade(int point) {
			this.point = point;
		}

		int getPoint() {
			return point;
		}

	};
	
	String id;
	String name;
	//��õ�����ѧ��
	int credits;
	
	//TODO:01��Ӳ��Ա���gradingStrategy������ʼ��Ϊ��ͨ�ȼ���������
	private GradingStrategy gradingStrategy=new RegularGradingStrategy();
	
	
	//TODO:02���gradingStrategy��setters��getters����

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
	 * ���ƽ���ɼ�
	 * @return ����ƽ���ɼ�
	 */
	public double getGpa() {
		if (grades.isEmpty()) {
			return 0;
		}
		double points = 0;
		for (Grade grade : grades) {
			//TODO:03ʹ�ò��Խӿڵ���Ӧ��������ȡ����
			points += gradingStrategy.getGradePointsFor(grade);
		}
		return points /grades.size();
	}
}

