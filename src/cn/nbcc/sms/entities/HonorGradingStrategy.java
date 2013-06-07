package cn.nbcc.sms.entities;

import cn.nbcc.sms.entities.Student.Grade;

/**
 * 
 * @author  zhengzhe
 * @Jun 7, 2013
 */
//TODO:05-1使用继承简化代码
//TODO:08-1使用继承抽象类简化代码
public class HonorGradingStrategy extends BasicGradingStrategy  {
	@Override
	public int getGradePointsFor(Grade grade) {
		//TODO:06-1调用父类相应方法简化代码
		int point = super.basicGradeFor(grade);
		if (point>0) {
			point+=1;
		}
		return point;
	}
}

