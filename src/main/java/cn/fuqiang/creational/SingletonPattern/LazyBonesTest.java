package cn.fuqiang.creational.SingletonPattern;

import cn.fuqiang.creational.SingletonPattern.lazybones.SingletonGeneral;
import cn.fuqiang.creational.SingletonPattern.lazybones.SingletonSynchronizedInitializersOneIf;

public class LazyBonesTest {
	public static void main(String[] args) {
		//测试懒加载普通单例模式
		singletonGeneral();
		//测试懒加载单校验版的单例
		synchronizedInitializersOneIf();
		/*
		 *执行结果：
		 *		t1线程飘过    成功进入 SingletonGeneral if判断  开始创建新实例
				cn.fuqiang.creational.SingletonPattern.lazybones.SingletonGeneral@7e60fa3c
				t2线程飘过    成功进入 SingletonGeneral if判断  开始创建新实例
				t3线程飘过    成功进入 SingletonGeneral if判断  开始创建新实例
				cn.fuqiang.creational.SingletonPattern.lazybones.SingletonGeneral@516036b8
				cn.fuqiang.creational.SingletonPattern.lazybones.SingletonGeneral@3a8bee79
				t4线程飘过    成功进入 SingletonGeneral if判断  开始创建新实例
				cn.fuqiang.creational.SingletonPattern.lazybones.SingletonGeneral@42c40a13
				t5线程飘过    成功进入 SingletonGeneral if判断  开始创建新实例
				cn.fuqiang.creational.SingletonPattern.lazybones.SingletonGeneral@5ce302f8
				t1线程飘过    成功进入 SingletonSynchronizedInitializersOneIf类的 synchronized代码块  开始创建新实例
				cn.fuqiang.creational.SingletonPattern.lazybones.SingletonSynchronizedInitializersOneIf@6a8e6395
				t2线程飘过    成功进入 SingletonSynchronizedInitializersOneIf类的 synchronized代码块  开始创建新实例
				cn.fuqiang.creational.SingletonPattern.lazybones.SingletonSynchronizedInitializersOneIf@49f32bed
				t3线程飘过    成功进入 SingletonSynchronizedInitializersOneIf类的 synchronized代码块  开始创建新实例
				cn.fuqiang.creational.SingletonPattern.lazybones.SingletonSynchronizedInitializersOneIf@2814cca4
				t4线程飘过    成功进入 SingletonSynchronizedInitializersOneIf类的 synchronized代码块  开始创建新实例
				cn.fuqiang.creational.SingletonPattern.lazybones.SingletonSynchronizedInitializersOneIf@62b79014
				t5线程飘过    成功进入 SingletonSynchronizedInitializersOneIf类的 synchronized代码块  开始创建新实例
				cn.fuqiang.creational.SingletonPattern.lazybones.SingletonSynchronizedInitializersOneIf@2fd3b3a7
			总结：单校验和普通单例模式都是线程不安全的
		 */
	}
	/**
	 * 普通的单例模式测试
	 * @author 王福强
	 * @Description 
	 * 总结：
	 * 
	 * @date 2018年8月27日 下午4:13:37
	 */
	public static void singletonGeneral() {
		Thread t1 = new Thread(() -> System.out.println(SingletonGeneral.getInstance())); 
		t1.setName("t1");
		Thread t2 = new Thread(() -> System.out.println(SingletonGeneral.getInstance())); 
		t2.setName("t2");
		Thread t3 = new Thread(() -> System.out.println(SingletonGeneral.getInstance()));
		t3.setName("t3");
		Thread t4 = new Thread(() -> System.out.println(SingletonGeneral.getInstance())); 
		t4.setName("t4");
		Thread t5 = new Thread(() -> System.out.println(SingletonGeneral.getInstance())); 
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
	 * 单例模式单校验测试
	 * @author 王福强
	 * @Description 
	 * @date 2018年8月27日 下午4:29:55
	 */
	public static void synchronizedInitializersOneIf() {
		Thread t1 = new Thread(() -> System.out.println(SingletonSynchronizedInitializersOneIf.getInstance())); 
		t1.setName("t1");
		Thread t2 = new Thread(() -> System.out.println(SingletonSynchronizedInitializersOneIf.getInstance())); 
		t2.setName("t2");
		Thread t3 = new Thread(() -> System.out.println(SingletonSynchronizedInitializersOneIf.getInstance()));
		t3.setName("t3");
		Thread t4 = new Thread(() -> System.out.println(SingletonSynchronizedInitializersOneIf.getInstance())); 
		t4.setName("t4");
		Thread t5 = new Thread(() -> System.out.println(SingletonSynchronizedInitializersOneIf.getInstance())); 
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
