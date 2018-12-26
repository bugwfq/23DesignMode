package cn.fuqiang.creational.SingletonPattern.lazybones;
/**
 * 懒汉式   (也可以说是懒汉式与饿汉式的结合)
 * @author 王福强
 * @Title: SingletonStaticInnerClass.java 
 * @Package cn.fuqiang.creational.SingletonPattern.lazybones
 * @Description    
 * 使用静态内部类达到Lazy Loading(延迟加载)的效果，在静态内部类中使用饿汉式的方式创建父类实例，然后在父类中return子类中创建的父类实例
 * @date 2018年8月27日 上午9:42:37
 */
public class SingletonStaticInnerClass {
	/**
	 * 单例模式的关键
	 * @author 王福强
	 * @Description 
	 * @date 2018年8月27日 上午9:46:05
	 */
	private SingletonStaticInnerClass() {};
	
	/**
	 * 优点：只有在调用getInstance 方法时，父类调用静态内部类，静态内部类才会加载然后以 饿汉式 的方式创建父类实例并且返回
	 * (一个类在被初始化的时候其他线程式无法访问该类的，所以这样也是线程安全的，而且效率比同步锁高)
	 * @author 王福强
	 * @Title: SingletonStaticInnerClass.java 
	 * @Package cn.fuqiang.creational.SingletonPattern.lazybones
	 * @Description 
	 * @date 2018年8月27日 上午9:51:08
	 */
	private static class SingletonInnerClass{
		private final static SingletonStaticInnerClass singletonStaticInnerClass = new SingletonStaticInnerClass();
	}
	public static SingletonStaticInnerClass getInstance() {
		return SingletonStaticInnerClass.SingletonInnerClass.singletonStaticInnerClass;
	}

}
