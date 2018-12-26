package cn.fuqiang.creational.SingletonPattern.lazybones;
/**
 * 懒汉式  (简单延迟加载      线程不安全)
 * @author 王福强
 * @Title: SingletonGeneral.java 
 * @Package cn.fuqiang.creational.SingletonPattern.lazybones
 * @Description  使用静态工厂方法创建实例，这种写法起到了Lazy Loading(延迟加载)的效果，
 * 				使用if判断实例是否被创建，但是只能在单线程下使用   多线程情况下是不安全的
 * @date 2018年8月22日 上午11:25:28
 */
public class SingletonGeneral {
	private static SingletonGeneral singletonGeneral;
	/**
	 * 构造器私有化是单例的关键
	 * @author 王福强
	 * @Description 
	 * @date 2018年8月22日 下午1:54:15
	 */
	private SingletonGeneral() {}
	
	/**
	 * 优点：延迟加载，在调用的时候会判断是否被创建，如果被创建则返回，如果没有被创建则创建
	 * 缺点：如果在多线程环境下，有可能其线程也会进入if中,从而先创建的会被后创建的覆盖
	 * @author 王福强
	 * @Description 
	 * @date 2018年8月22日 下午2:04:49
	 * @return 
	 */
	public static SingletonGeneral getInstance() {
		if(singletonGeneral==null) {
			//通过显示当前前程的方法判断哪个线程进入了判断中
			System.out.println(Thread.currentThread().getName()+"线程飘过    成功进入 SingletonGeneral if判断  开始创建新实例");
			return new SingletonGeneral();
		}
		return singletonGeneral;
	}
}
