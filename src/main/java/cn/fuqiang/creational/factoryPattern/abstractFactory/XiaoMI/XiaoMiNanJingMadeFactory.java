package cn.fuqiang.creational.factoryPattern.abstractFactory.XiaoMI;

import cn.fuqiang.creational.factoryPattern.abstractFactory.AbstractFactory;
import cn.fuqiang.creational.factoryPattern.abstractFactory.ComputerPlant;
import cn.fuqiang.creational.factoryPattern.abstractFactory.PhonePlant;
/**
 * 小米南京制造业
 * 两个工厂就是抽象工厂的提现，产生的方法由车间去实现
 * @author 王福强
 * @Title: XiaoMiNanJingMadeFactory.java 
 * @Package cn.fuqiang.creational.factoryPattern.abstractFactory.XiaoMI
 * @Description 
 * @date 2018年9月4日 下午2:44:22
 */
public class XiaoMiNanJingMadeFactory implements AbstractFactory {

	@Override
	public PhonePlant getPhonePlant() {
		return new XiaoMi6xPhonePlant();
	}

	@Override
	public ComputerPlant getComputerPlant() {
		return new XiaoMiAirComputerPlant();
	}

}
