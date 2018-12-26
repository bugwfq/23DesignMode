package cn.fuqiang.creational.factoryPattern.commonFactory;
/**
 * @author 王福强
 * @Title: FruitsFactory.java 
 * @Package cn.fuqiang.factory.simpleFactory
 * @Description 抽象水果工厂接口
 * @date 2018年7月16日 下午4:11:44
 */
public interface Fruits {
	
	/**
	 * 
	 * @author 王福强
	 * @Description  发芽 
	 * @date 2018年7月16日 下午4:42:23
	 */
	void sprout();
	
	/**
	 * 
	 * @author 王福强
	 * @Description  成熟
	 * @date 2018年7月16日 下午4:43:21
	 */
	void maturity();

}
