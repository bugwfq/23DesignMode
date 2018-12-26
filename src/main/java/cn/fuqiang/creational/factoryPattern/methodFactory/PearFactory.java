package cn.fuqiang.creational.factoryPattern.methodFactory;

/**
 * 
 * @author 王福强
 * @Title: PearFactory.java 
 * @Package cn.fuqiang.factory.methodFactory
 * @Description 梨工厂  <br/>
 *	工厂方法  
 * @date 2018年7月19日 下午4:11:42
 */
public class PearFactory implements FruitsFactory {
	/**
	 * 重写父类方法，自定义返回对象，但是返回对象必须是Fruits子类
	 */
	@Override
	public Fruits getInstance() {
		return new Pear();
	}
}
