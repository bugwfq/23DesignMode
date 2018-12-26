package cn.fuqiang.creational.SingletonPattern.lazybones;

/**
 * 懒汉式 (同步代码块     单校验)  不安全
 * @author 王福强
 * @Title: SingletonSynchronizedInitializers.java 
 * @Package cn.fuqiang.creational.SingletonPattern.lazybones
 * @Description 使用静态工厂方法创建实例，这种写法起到了Lazy Loading(延迟加载)的效果，
 * 				再使用同步代码块来控制线程安全  
 * @date 2018年8月23日 下午2:06:44
 */
public class SingletonSynchronizedInitializersOneIf {
	/**
	 * 构造器私有化，单例模式的关键
	 * @author 王福强
	 * @Description 
	 * @date 2018年8月23日 下午2:10:39
	 */
	private SingletonSynchronizedInitializersOneIf() {}
	private static SingletonSynchronizedInitializersOneIf singletonSynchronizedInitializers;
	/**
     * 优点： 遵循了Lazy Loading(延迟加载)，在调用时会判断对象是否已经创建并返回， 通过同步代码块来控制线程安全。
	 * 缺点：这种方式虽然比同步方法效率有所提升但是线程安全上还是存在问题，如果多个线程都进入if块中，
	 * 虽然同步代码块中每次只能进入一个线程，但是等进入同步代码块中的线程创建完成后，其他进入if的线程还是会创建一遍
	 * 所以再某种情况下这种方法还是存在问题的
	 * @author 王福强
	 * @Description 
	 * @date 2018年8月24日 上午8:53:25
	 * @return
	 */
	public static SingletonSynchronizedInitializersOneIf getInstance() {
		if(singletonSynchronizedInitializers == null) {
			synchronized(SingletonSynchronizedInitializersOneIf.class) {
				//通过显示当前前程的方法判断哪个线程进入了判断中
				System.out.println(Thread.currentThread().getName()+"线程飘过    成功进入 SingletonSynchronizedInitializersOneIf类的 synchronized代码块  开始创建新实例");
				return new SingletonSynchronizedInitializersOneIf();
			}
		}
		return singletonSynchronizedInitializers;
	}

}
