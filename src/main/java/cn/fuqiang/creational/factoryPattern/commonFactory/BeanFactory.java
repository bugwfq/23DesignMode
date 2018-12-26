package cn.fuqiang.creational.factoryPattern.commonFactory;

/**
 * 通用工厂模式
 * @author 王福强
 * @Title: BeanFactory.java 
 * @Package cn.fuqiang.factory.commonFactory
 * @Description 工厂模式改进版  可以作为通用的工厂工具类
 * @date 2018年7月24日 上午11:35:31
 */
public class BeanFactory {
	
	/**
	 * 
	 * @author 王福强
	 * @Description 根据指定的类型返回创建的实例
	 * @date 2018年7月19日 上午9:35:27
	 * @param 指定创建实例类型
	 * @return 返回创建的指定类型的实例
	 * @throws Exception
	 */
	public static <T> T getInstance(Class<T> t) throws Exception {
		return getInstance(t.getName(),t);
	}
	
	/**
	 * 
	 * @author 王福强
	 * @Description 更具传入的  全类名 和指定的返回类型  返回指定类型的实例
	 * @date 2018年7月19日 上午9:45:09
	 * @param className  某子类的全类名
	 * @param t 返回类型  返回类型必须是
	 * @return 返回指定实例
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static <T> T  getInstance(String className,Class<T> t) throws Exception {
		Object newInstance = getInstance(className);
		//判断newInstance是否与t类型相同，或是否为t类型子类  如果不是则抛出异常
		if(newInstance !=null && !t.isAssignableFrom(newInstance.getClass())) {
			throw new Exception("传入类型必须是"+t.getTypeName()+"子类");
		}
		return (T) newInstance;
	}

	/**
	 * 
	 * @author 王福强
	 * @Description  更具全类名返回对应的实体，但是前提必须为Fruits的子类
	 * @date 2018年7月19日 上午9:50:49
	 * @param className
	 * @return
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static Object getInstance(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException  {
		Class<?> forName = Class.forName(className);
		Object newInstance = forName.newInstance();
		if(newInstance!=null) {
			return  newInstance;
		}
		return null;
	}
}
