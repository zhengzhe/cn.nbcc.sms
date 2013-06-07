package cn.nbcc.sms.entities;

import cn.nbcc.sms.entities.Student.Grade;

/**
 * 
 * @author  zhengzhe
 * @Jun 7, 2013
 */
public class RegularGradingStrategy implements GradingStrategy {
	@Override
	public int getGradePointsFor(Grade grade) {
		switch (grade) {
		case A:
			return 5;
		case B:
			return 4;
		case C:
			return 3;
		case D:
			return 2;
		default:
			return 0;
		}
	}
}

