package cn.fuqiang.creational.factoryPattern.abstractFactory;

import cn.fuqiang.creational.factoryPattern.abstractFactory.Huawei.HuaweiShenZhengMadeFactory;
import cn.fuqiang.creational.factoryPattern.abstractFactory.XiaoMI.XiaoMiNanJingMadeFactory;

/**
 * 抽象工厂
 * @author 王福强
 * @Title: AbstractFactoryTest.java 
 * @Package cn.fuqiang.factory.abstractFactory
 * @Description 抽象工厂模式是对象的创建模式，它是工厂方法模式的进一步推广。<br/>是对工厂方法进行了改装
 * 
 * 在这里我以   华为和小米两家企业来举例
 * 华为和小米，都有自己的电脑产品和手机产品，但是他们的工厂模式创建方式都是大同小异的。
 * 
 * 现在将他们的企业制造     抽象出来  
 * 简单抽出：
 * 		制造业(就是我们此处的AbstractFactory类)
 * 			-手机工厂 (PhonePlant类)
 * 				-手机的制造
 * 			-电脑工厂(ComputerPlant类)
 * 				-电脑的制造
 * 这样呢华为制造和小米制造就可以继承这个体系
 * 
 *华为制造业  -> 
 *		 -华为手机工厂
 *		 -华为电脑工厂
 *
 *小米制造业  -> 
 *		 -小米手机工厂
 *		 -小米电脑工厂
 * 
 * @date 2018年7月25日 上午9:18:03
 */
public class AbstractFactoryTest {
	public static void main(String[] args) {
		/*、
		 * 两种企业都有相似的工厂，把他们提取出来 就是抽象工厂的意义 她抽象出来的是一个系列产品
		 */
		
		//华为制造业
		AbstractFactory abstractFactory = new HuaweiShenZhengMadeFactory();
		
		PhonePlant phonePlant = abstractFactory.getPhonePlant();
		Phone phone = new Phone();
		phonePlant.packagePhone(phone);
		
		ComputerPlant computerPlant = abstractFactory.getComputerPlant();
		Computer computer = new Computer();
		computerPlant.packageComputer(computer);
		
		System.out.println(phone);
		System.out.println(computer);
		
		//小米制造业
        abstractFactory = new XiaoMiNanJingMadeFactory();
		
		phonePlant = abstractFactory.getPhonePlant();
		phone = new Phone();
		phonePlant.packagePhone(phone);
		
		computerPlant = abstractFactory.getComputerPlant();
		computer = new Computer();
		computerPlant.packageComputer(computer);
		
		System.out.println(phone);
		System.out.println(computer);
		
	}
}
