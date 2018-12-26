package cn.fuqiang.creational.SingletonPattern.lazybones;


/**
 * 懒汉式  同步方法 (效率低)
 * @author 王福强
 * @Title: SingletonSynchronizedMethod.java 
 * @Package cn.fuqiang.creational.SingletonPattern.lazybones
 * @Description 使用静态工厂方法创建实例，这种写法起到了Lazy Loading(延迟加载)的效果，
 * 				使用if判断实例是否被创建，使用了synchronized方法锁 来保证线程安全
 * @date 2018年8月23日 上午9:13:39
 */
public class SingletonSynchronizedMethod {
	/**
	 * 构造器私有化，单例的关键
	 * @author 王福强
	 * @Description 
	 * @date 2018年8月23日 下午1:31:58
	 */
	private SingletonSynchronizedMethod() {}
	
	private static SingletonSynchronizedMethod singletonSynchronizedMethod;
	
	/**
	 * 优点： 遵循了Lazy Loading(延迟加载)，在调用时会判断对象是否已经创建并返回， 通过同步方法来控制线程安全。
	 * 缺点：也是synchronized method 的缺点，当每一次调用该方法的时候其他线程都会被阻止进入。所以效率就会降低
	 * @author 王福强
	 * @Description 
	 * @date 2018年8月23日 下午1:40:29
	 * @return
	 */
	public static synchronized SingletonSynchronizedMethod getInstance(){
		if(singletonSynchronizedMethod == null) {
			return new SingletonSynchronizedMethod();
		}
		return singletonSynchronizedMethod;
	}
	
}
