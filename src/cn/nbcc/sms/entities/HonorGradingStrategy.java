package cn.nbcc.sms.entities;

import cn.nbcc.sms.entities.Student.Grade;

/**
 * 
 * @author  zhengzhe
 * @Jun 7, 2013
 */
public class HonorGradingStrategy extends BasicGradingStrategy implements GradingStrategy {
	@Override
	public int getGradePointsFor(Grade grade) {
		int point = basicGradeFor(grade);
		if (point>0) {
			point+=1;
		}
		return point;
	}
}

