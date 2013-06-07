package cn.nbcc.sms.entities;
/**
 * 
 * @author  zhengzhe
 * @Jun 7, 2013
 */
public interface GradingStrategy {
	public int getGradePointsFor(Student.Grade grade);

}

