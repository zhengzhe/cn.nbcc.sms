package cn.nbcc.sms.entities;

import cn.nbcc.sms.entities.Student.Grade;

//TODO:04:����ͬ�Ĵ����ȡ������
//TODO:07:����Ϊ�����࣬��ʵ��GradingStrategy�ӿ�
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

