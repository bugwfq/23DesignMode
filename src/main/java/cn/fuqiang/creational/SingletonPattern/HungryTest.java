package cn.fuqiang.creational.SingletonPattern;

import cn.fuqiang.creational.SingletonPattern.hungry.SingletonField;
import cn.fuqiang.creational.SingletonPattern.hungry.SingletonStaticInitializers;
/**
 * 针对两种饿汉式的测试就，饿汉式虽然是线程安全的但是没有办法达到lazy loading(懒加载  )
 * @author 王福强
 * @Title: HungryTest.java 
 * @Package cn.fuqiang.creational.SingletonPattern
 * @Description 
 * @date 2018年8月27日 下午4:06:40
 */
public class HungryTest {
	/**
	 * 通过比较，两种都是线程安全的，但是缺点就是如果从始至终从未使用过这个实例，则会造成内存的浪费
	 * @author 王福强
	 * @Description 
	 * @date 2018年8月27日 下午4:09:12
	 * @param args
	 */
	public static void main(String[] args) {
		//测试静态常量式的单例  每个方法中会创建五个线程
		staticField();
		//测试静态代码块中的单例
		staticInitializers();
		
		/*	执行结果：
			    cn.fuqiang.creational.SingletonPattern.hungry.SingletonField@7e60fa3c
				cn.fuqiang.creational.SingletonPattern.hungry.SingletonField@7e60fa3c
				cn.fuqiang.creational.SingletonPattern.hungry.SingletonField@7e60fa3c
				cn.fuqiang.creational.SingletonPattern.hungry.SingletonField@7e60fa3c
				cn.fuqiang.creational.SingletonPattern.hungry.SingletonField@7e60fa3c
				cn.fuqiang.creational.SingletonPattern.hungry.SingletonStaticInitializers@27983662
				cn.fuqiang.creational.SingletonPattern.hungry.SingletonStaticInitializers@27983662
				cn.fuqiang.creational.SingletonPattern.hungry.SingletonStaticInitializers@27983662
				cn.fuqiang.creational.SingletonPattern.hungry.SingletonStaticInitializers@27983662
				cn.fuqiang.creational.SingletonPattern.hungry.SingletonStaticInitializers@27983662
			总结：线程安全
			
		 */
	}
	/**
	 * 静态常量方式创建实例
	 * @author 王福强
	 * @Description 
	 * @date 2018年8月27日 下午4:12:19
	 */
	public static void staticField() {
		Thread t1 = new Thread(() -> System.out.println(SingletonField.getInstance())); 
		t1.setName("t1");
		Thread t2 = new Thread(() -> System.out.println(SingletonField.getInstance())); 
		t2.setName("t2");
		Thread t3 = new Thread(() -> System.out.println(SingletonField.getInstance()));
		t3.setName("t3");
		Thread t4 = new Thread(() -> System.out.println(SingletonField.getInstance())); 
		t4.setName("t4");
		Thread t5 = new Thread(() -> System.out.println(SingletonField.getInstance())); 
		t5.setName("t5");
		try {
		t1.start();
			t1.join();
			t2.start();
			t3.start();
			t4.start();
			t4.join();
			t5.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 静态代码方式的创建实例
	 * @author 王福强
	 * @Description 
	 * @date 2018年8月27日 下午4:12:52
	 */
	public static void staticInitializers() {
		Thread t1 = new Thread(() -> System.out.println(SingletonStaticInitializers.getInstance())); 
		t1.setName("t1");
		Thread t2 = new Thread(() -> System.out.println(SingletonStaticInitializers.getInstance())); 
		t2.setName("t2");
		Thread t3 = new Thread(() -> System.out.println(SingletonStaticInitializers.getInstance()));
		t3.setName("t3");
		Thread t4 = new Thread(() -> System.out.println(SingletonStaticInitializers.getInstance())); 
		t4.setName("t4");
		Thread t5 = new Thread(() -> System.out.println(SingletonStaticInitializers.getInstance())); 
		t5.setName("t5");
		try {
		t1.start();
			t1.join();
			t2.start();
			t3.start();
			t4.start();
			t4.join();
			t5.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
