package cn.nbcc.sms.entities;

import cn.nbcc.sms.entities.Student.Grade;

/**
 * 
 * @author  zhengzhe
 * @Jun 7, 2013
 */
//TODO:05-2ʹ�ü̳м򻯴���
//TODO:08-2ʹ�ü̳г�����򻯴���
public class RegularGradingStrategy extends BasicGradingStrategy {
	@Override
	public int getGradePointsFor(Grade grade) {
		//TODO:06-2���ø�����Ӧ�����򻯴���
		return super.basicGradeFor(grade);
	}
}

