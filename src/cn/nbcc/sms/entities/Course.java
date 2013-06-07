package cn.nbcc.sms.entities;
/**
 * 
 * @author  zhengzhe
 * @2013-5-7
 */
public class Course {
	
	private String cID;
	private String cName;
	private int credit;
	private int count;
	
	public Course(){
	}
	public Course(String cID, String cName, int credit) {
		super();
		this.cID = cID;
		this.cName = cName;
		this.credit = credit;
		count++;
		System.out.printf("%d courses created\n", count);
	}
	public String getcID() {
		return cID;
	}
	public void setcID(String cID) {
		this.cID = cID;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
}

