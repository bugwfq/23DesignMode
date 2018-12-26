package cn.fuqiang.creational.factoryPattern.methodFactory;
/**
 * 工厂方法
 * @author 王福强
 * @Title: MethodFactoryTest.java 
 * @Package cn.fuqiang.factory.methodFactory
 * @Description  
 * 工厂方法模式是类的创建模式，又叫做虚拟构造子(Virtual Constructor)模式或多态性工厂(Polymorphic Factory)模式<br/>
 * 工厂方法模式的用意是定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类中<br/>
 * 在不用注解的情况下，更好的遵循了开-闭原则。<br/>
 * 更加方便与后期扩展 
 * @date 2018年7月19日 下午5:01:53
 */
public class MethodFactoryTest {
	public static void main(String[] args) {
		//创建苹果工厂并返回对应的对象
		FruitsFactory factory = new AppleFactory();
		Fruits instance = factory.getInstance();
		instance.sprout();
		instance.maturity();
		//创建梨工厂返回对应的对象
		factory = new PearFactory();
		instance = factory.getInstance();
		instance.sprout();
		instance.maturity();
	}
}
