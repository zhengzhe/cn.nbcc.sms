package cn.nbcc.sms.entities;

import cn.nbcc.sms.entities.Student.Grade;

/**
 * 
 * @author  zhengzhe
 * @Jun 7, 2013
 */
//TODO:05-3ʹ�ü̳м򻯴���
//TODO:08-3ʹ�ü̳г�����򻯴���
public class GuestGradingStrategy extends BasicGradingStrategy {
	@Override
	public int getGradePointsFor(Grade grade) {
		//TODO:06-3���ø�����Ӧ�����򻯴���
		int point = super.basicGradeFor(grade);
		if (point>0) {
			point-=1;
		}
		return point;
	}
}

