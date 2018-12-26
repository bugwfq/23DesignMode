package cn.fuqiang.creational.factoryPattern.methodFactory;

/**
 * 苹果类
 * @author 王福强
 * @Title: Apple.java 
 * @Package cn.fuqiang.factory.methodFactory
 * @Description 
 * @date 2018年7月19日 下午3:51:37
 */
public class Apple implements Fruits {

	@Override
	public void sprout() {
		System.out.println("苹果树发芽");
	}

	@Override
	public void maturity() {
		System.out.println("苹果树结果");
	}

}
