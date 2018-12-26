package cn.fuqiang.creational.SingletonPattern.hungry;
/**
 * 饿汉式（静态代码化块 创建实例）
 * @author 王福强
 * @Title: SingletonStaticInitializers.java 
 * @Package cn.fuqiang.creational.SingletonPattern.hungry
 * @Description ：静态代码    块创建实例  ， 因为静态代码块是在类加载的时候才会执行，且一个生命周期中只会执行一次 
 * @date 2018年8月22日 上午10:30:38
 */
public class SingletonStaticInitializers {
	/**
	 * 此处不能加final关键字  因为final修饰的常量必须在声明的时候就初始化赋值 
	 */
	private static SingletonStaticInitializers singletonStaticInitializers;
	/**
	 * 优点 ：当类初始化加载就会完成实例的创建，避免多线程情况下线程同步问题
	 * 缺点：没有达到Lazy Loading(延迟加载)的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
	 */
	static {
		singletonStaticInitializers = new SingletonStaticInitializers();
	}
	/**
	 * 单例模式的关键 构造器私有化
	 * @author 王福强
	 * @Description 
	 * @date 2018年8月22日 上午10:31:41
	 */
	private SingletonStaticInitializers() {}
	
	
	public static SingletonStaticInitializers getInstance(){
		return singletonStaticInitializers;
	}

}
