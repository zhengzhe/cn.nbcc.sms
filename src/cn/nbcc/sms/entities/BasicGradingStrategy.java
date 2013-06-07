package cn.nbcc.sms.entities;

import cn.nbcc.sms.entities.Student.Grade;
public class BasicGradingStrategy {
	public int basicGradeFor(Grade grade) {
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

