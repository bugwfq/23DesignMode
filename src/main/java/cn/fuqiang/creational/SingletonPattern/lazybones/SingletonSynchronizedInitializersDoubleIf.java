package cn.fuqiang.creational.SingletonPattern.lazybones;
/**
 * 饿汉式  同步代码块双重校验 
 * @author 王福强
 * @Title: SingletonSynchronizedInitializersDoubleIf.java 
 * @Package cn.fuqiang.creational.SingletonPattern.lazybones
 * @Description 使用静态工厂方法创建实例，这种写法起到了Lazy Loading(延迟加载)的效果，
 * 				再使用同步代码块和双重校验  来控制线程安全 (但是在java中双重校验还是有一定的缺陷)
 * @date 2018年8月24日 上午9:24:49
 */
public class SingletonSynchronizedInitializersDoubleIf {
	/**
	 * 构造器私有化是同步代码块的关键
	 * @author 王福强
	 * @Description 
	 * @date 2018年8月24日 上午9:27:44
	 */
	private SingletonSynchronizedInitializersDoubleIf(){};
	
	private static SingletonSynchronizedInitializersDoubleIf singletonSynchronizedInitializersDoubleIf;
	
	/**
	 * 优点： 
	 * 		遵循了Lazy Loading(延迟加载)，在调用时会判断对象是否已经创建并返回， 通过同步代码块来控制线程安全。使用Double-Check校验的方式
	 *尽可能的保证线程安全 
	 *
	 * 缺点：
	 * 		双重检查锁定背后的理论是完美的。不幸地是，现实完全不同。
	 * 双重检查锁定的问题是：并不能保证它会在单处理器或多处理器计算机上顺利运行。双重检查锁定失败的问题并不归咎于 JVM 中的实现 bug，
	 * 而是归咎于 Java 平台内存模型。内存模型允许所谓的“无序写入”，这也是这些习语失败的一个主要原因。
	 * @author 王福强
	 * @Description 
	 * @date 2018年8月27日 上午9:36:53
	 * @return
	 */
	public static SingletonSynchronizedInitializersDoubleIf getInstance() {
		if(singletonSynchronizedInitializersDoubleIf==null) {
			synchronized(SingletonSynchronizedInitializersDoubleIf.class) {
				if(singletonSynchronizedInitializersDoubleIf==null) {
					return new SingletonSynchronizedInitializersDoubleIf(); 
				}
			}
		}
		return singletonSynchronizedInitializersDoubleIf;
	}
}
