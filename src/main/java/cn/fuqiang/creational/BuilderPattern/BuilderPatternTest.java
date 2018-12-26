package cn.fuqiang.creational.BuilderPattern;

public class BuilderPatternTest {
	public static void main(String[] args) {
		/*
		 * 建造者模式，具体建造过程类
		 */
		ThinkPadBuilder thinkPadBuilder = new ThinkPadBuilder();
		/*
		 *指挥类 
		 */
		Director director = new Director(thinkPadBuilder);
		//指挥方法
		Computer construct = director.construct();
		System.out.println(construct);
	}
}
