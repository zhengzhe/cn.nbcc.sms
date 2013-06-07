package cn.nbcc.sms.entities;
/**
 * @author  zhengzhe
 * @2013-5-7
 */
public class Student {
	
	String id;
	String name;
	//获得的现有学分
	int credits;
	
	
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
	
}

