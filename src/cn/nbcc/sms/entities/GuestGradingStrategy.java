package cn.nbcc.sms.entities;

import cn.nbcc.sms.entities.Student.Grade;

/**
 * 
 * @author  zhengzhe
 * @Jun 7, 2013
 */
public class GuestGradingStrategy implements GradingStrategy {
	@Override
	public int getGradePointsFor(Grade grade) {
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

