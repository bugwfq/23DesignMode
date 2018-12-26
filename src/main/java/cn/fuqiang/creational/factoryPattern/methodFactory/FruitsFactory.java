package cn.fuqiang.creational.factoryPattern.methodFactory;
/**
 * 抽象 工厂方法接口
 * @author 王福强
 * @Title: FruitsFactory.java 
 * @Package cn.fuqiang.factory.methodFactory
 * @Description 只要子类工厂实现该方法则可以自定义返回对象<br/>
 * 也就是说把创建子类的工作，交给子类去做，子类只需要实现父类的方法。
 * @date 2018年7月19日 下午4:52:16
 */
public interface FruitsFactory {
	/**
	 * 
	 * @author 王福强
	 * @Description 子类需要实现该方法，并且定义 返回需要创建的实体 
	 * @date 2018年7月19日 下午4:53:35
	 * @return  
	 */
	Fruits getInstance();
}
