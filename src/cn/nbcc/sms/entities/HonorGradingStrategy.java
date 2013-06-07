package cn.nbcc.sms.entities;

import cn.nbcc.sms.entities.Student.Grade;

/**
 * 
 * @author  zhengzhe
 * @Jun 7, 2013
 */
public class HonorGradingStrategy implements GradingStrategy {
	@Override
	public int getGradePointsFor(Grade grade) {
		switch (grade) {
		case A:
			return 6;
		case B:
			return 5;
		case C:
			return 4;
		case D:
			return 3;
		default:
			return 0;
		}
	}
}

