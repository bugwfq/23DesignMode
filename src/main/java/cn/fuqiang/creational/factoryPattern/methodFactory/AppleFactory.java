package cn.fuqiang.creational.factoryPattern.methodFactory;
/**
 * 
 * @author 王福强
 * @Title: AppleFactory.java 
 * @Package cn.fuqiang.factory.methodFactory
 * @Description apple工厂类 通过实现父类方法来返回苹果实例
 * @date 2018年7月19日 下午4:56:19
 */
public class AppleFactory implements FruitsFactory {
	/**
	 * * 重写父类方法，自定义返回对象，但是返回对象必须是Fruits子类
	 */
	@Override
	public Fruits getInstance() {
		return new Apple();
	}
}
