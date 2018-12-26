package cn.fuqiang.creational.factoryPattern.simpleFactory;

public class Pear implements Fruits {

	@Override
	public void sprout() {
		System.out.println("梨树发芽");
	}

	@Override
	public void maturity() {
		System.out.println("梨树结果");
	}

}
