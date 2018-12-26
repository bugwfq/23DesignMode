package cn.fuqiang.creational.factoryPattern.simpleFactory;

/**
 * 
 * @author 王福强
 * @Title: FruitsFactory.java 
 * @Package cn.fuqiang.factory.simpleFactory
 * @Description  水果工厂类产生各种水果，但前提是某类水果必须实现Fruits接口 <br/>
 * 使用常量来定义每个实例对应的编号，在工厂方法中传入对应的实例编号去创建该实例
 * @date 2018年7月17日 上午10:46:22
 */
public class FruitsFactory {
	/**
	 * Apple entity
	 */
	public static int FRUITS_APPLE=1;
	/**
	 * pear entity
	 */
	public static int FRUITS_PEAR=2;

	/**
	 * 
	 * @author 王福强
	 * @Description 传入指定类型的 instance参数，返回指定的实例
	 * @date 2018年7月19日 上午9:18:12
	 * @param instance 指定返回实例 <br/>
	 *      FruitsFactory.FRUITS_APPLE   - Apple Instance <br/>
	 *      FruitsFactory.FRUITS_PEAR    - Pear  Instance
	 * @return Fruits 
	 * @throws Exception
	 */
	public static Fruits  getInstance(int instance) throws Exception {
		Fruits fruits = null;
		switch(instance) {
			case 1:
				fruits = new Apple();
				break;
			case 2:
				fruits = new Pear();
				break;	
		}
		return  fruits;
	}

}
