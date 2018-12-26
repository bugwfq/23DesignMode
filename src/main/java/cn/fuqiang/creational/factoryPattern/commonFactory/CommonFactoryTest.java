package cn.fuqiang.creational.factoryPattern.commonFactory;


/**
 * 工厂模式升级版测试
 * @author 王福强
 * @Title: CommonFactoryTest.java 
 * @Package cn.fuqiang.factory.CommonFactoryTest
 * @Description 
 * @date 2018年7月16日 上午9:51:08
 */
public class CommonFactoryTest {
	
	public static void main(String[] args) throws Exception {
		Fruits apple = BeanFactory.getInstance(Apple.class);
		apple.sprout();
		apple.maturity();

		
		Pear pear = BeanFactory.getInstance("cn.fuqiang.factory.commonFactory.Pear",Pear.class);
		pear.sprout();
		pear.maturity();
		
	}
	
}
