package cn.nbcc.sms.entities;

import cn.nbcc.sms.entities.Student.Grade;

//TODO:04:����ͬ�Ĵ����ȡ������
//TODO:07:����Ϊ�����࣬��ʵ��GradingStrategy�ӿ�
public abstract class BasicGradingStrategy implements GradingStrategy{
	public int basicGradeFor(Grade grade) {
		return grade.getPoint();
	}
}

