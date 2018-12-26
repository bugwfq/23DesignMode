package cn.fuqiang.creational.factoryPattern.methodFactory;

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
