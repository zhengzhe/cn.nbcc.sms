package cn.nbcc.sms.entities;

import cn.nbcc.sms.entities.Student.Grade;

/**
 * 
 * @author  zhengzhe
 * @Jun 7, 2013
 */
//TODO:05-2使用继承简化代码
//TODO:08-2使用继承抽象类简化代码
public class RegularGradingStrategy extends BasicGradingStrategy {
	@Override
	public int getGradePointsFor(Grade grade) {
		//TODO:06-2调用父类相应方法简化代码
		return super.basicGradeFor(grade);
	}
}

