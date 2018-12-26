package cn.fuqiang.creational.factoryPattern.simpleFactory;


/**
 * 简单工厂
 * @author 王福强
 * @Title SimpleFactory.java 
 * @Package cn.fuqiang.factory.simpleFactory
 * @Description 
 * 简单工厂模式(Simple Factory) <br/>
 * 简单工厂模式是类的创建模式,又叫做静态工厂方法(Static Factory Method)模式  <br/>
 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例  <br/>
 * 
 * @date 2018年7月16日 上午9:51:08
 */
public class SimpleFactoryTest {
	
	public static void main(String[] args) throws Exception {
		
		Fruits apple = FruitsFactory.getInstance(FruitsFactory.FRUITS_APPLE);
		apple.sprout();
		apple.maturity();

		
		Fruits pear = FruitsFactory.getInstance(FruitsFactory.FRUITS_PEAR);
		pear.sprout();
		pear.maturity();
		
		
	}
	
}
