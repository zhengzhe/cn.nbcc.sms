package cn.nbcc.sms.entities;

import cn.nbcc.sms.entities.Student.Grade;

//TODO:04:将共同的代码抽取到父类
//TODO:07:定义为抽象类，并实现GradingStrategy接口
public abstract class BasicGradingStrategy implements GradingStrategy{
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

