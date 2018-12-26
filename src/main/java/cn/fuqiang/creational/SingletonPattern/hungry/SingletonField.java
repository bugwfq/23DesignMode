package cn.fuqiang.creational.SingletonPattern.hungry;

/**
 * 饿汉式   (静态常量  创建实例) 不安全
 * @author 王福强
 * @Title: SingletonField.java 
 * @Package cn.fuqiang.creational.SingletonPattern.hungry
 * @Description 当类初始化加载得时候，就完成对象得实例化
 * @date 2018年8月21日 下午6:54:10
 */
public class SingletonField {
	/**
	 * 单例模式的关键，构造器私有化
	 * @author 王福强
	 * @Description 
	 * @date 2018年8月21日 下午7:18:19
	 */
	private SingletonField(){}
	/**
	 * 优点 ：当类初始化加载就会完成实例的创建，避免多线程情况下线程同步问题
	 * 缺点：没有达到Lazy Loading(延迟加载)的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
	 */
	private final static SingletonField singletonField = new SingletonField();
	public static SingletonField getInstance() {
		return singletonField;
	}

}
