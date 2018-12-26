package cn.fuqiang.creational.factoryPattern.abstractFactory.Huawei;

import cn.fuqiang.creational.factoryPattern.abstractFactory.AbstractFactory;
import cn.fuqiang.creational.factoryPattern.abstractFactory.ComputerPlant;
import cn.fuqiang.creational.factoryPattern.abstractFactory.PhonePlant;
/**
 * 华为深圳制造业
 * 
 * 抽象工厂模式的实例
 * 两个车间就是抽象出来的工厂
 *
 * @author 王福强
 * @Title: HuaweiShenZhengMadeFactory.java 
 * @Package cn.fuqiang.creational.factoryPattern.abstractFactory.Huawei
 * @Description 
 * @date 2018年9月4日 下午2:20:19
 */
public class HuaweiShenZhengMadeFactory implements AbstractFactory {

	@Override
	public PhonePlant getPhonePlant() {
		return new HuaweiP20PhonePlant();
	}

	@Override
	public ComputerPlant getComputerPlant() {
		return new HuaweiMateBookXProComputerPlant();
	}

}
