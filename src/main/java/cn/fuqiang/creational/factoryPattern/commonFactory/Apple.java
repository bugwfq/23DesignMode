package cn.fuqiang.creational.factoryPattern.commonFactory;

public class Apple implements Fruits{

	@Override
	public void sprout() {
		System.out.println("苹果树发芽");
	}

	@Override
	public void maturity() {
		System.out.println("苹果树结果");
	}

}
