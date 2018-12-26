package cn.fuqiang.creational.factoryPattern.abstractFactory.Huawei;

import cn.fuqiang.creational.factoryPattern.abstractFactory.Phone;
import cn.fuqiang.creational.factoryPattern.abstractFactory.PhonePlant;

/**
 * 华为的手机制造工厂
 * @author 王福强
 * @Title: HuaweiP20PhonePlant.java 
 * @Package cn.fuqiang.creational.factoryPattern.abstractFactory.Huawei
 * @Description 
 * @date 2018年9月4日 下午2:43:37
 */
public class HuaweiP20PhonePlant implements PhonePlant {

	@Override
	public void packagePhone(Phone phone) {
		phone.setName("HUAWEI");
		phone.setVersion("P20");
		phone.setCpu("麒麟970+8");
		phone.setScreen("TFT LCD（IPS）薄膜晶体管液晶显示器");
		phone.setBattery("3400mAh不可拆卸式电池");
	}
	
}
