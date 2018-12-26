package cn.fuqiang.creational.factoryPattern.abstractFactory.XiaoMI;

import cn.fuqiang.creational.factoryPattern.abstractFactory.Phone;
import cn.fuqiang.creational.factoryPattern.abstractFactory.PhonePlant;
/**
 * 小米手机制造工厂
 * @author 王福强
 * @Title: XiaoMi6xPhonePlant.java 
 * @Package cn.fuqiang.creational.factoryPattern.abstractFactory.XiaoMI
 * @Description 
 * @date 2018年9月4日 下午2:45:39
 */
public class XiaoMi6xPhonePlant implements PhonePlant {

	@Override
	public void packagePhone(Phone phone) {
		phone.setName("小米");
		phone.setBattery("3010mAh");
		phone.setCpu("骁龙825");
		phone.setScreen("第五代黑猩猩全面屏");
		phone.setVersion("6X");
	}

}
