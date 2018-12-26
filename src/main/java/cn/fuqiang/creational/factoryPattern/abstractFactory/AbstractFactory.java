package cn.fuqiang.creational.factoryPattern.abstractFactory;
/**
 * 抽象工厂模式 ，抽象工厂模式其实就是方法工厂的升级版
 * 只不过方法工厂是比较单一的，而抽象工厂是多元化的。
 * 方法工厂是某个产品
 * 抽象工厂是某个系列的产品
 * 
 * @author 王福强
 * @Title: AbstractFactory.java 
 * @Package cn.fuqiang.creational.factoryPattern.abstractFactory
 * @Description 
 * @date 2018年9月4日 下午2:11:13
 */
public interface AbstractFactory {
	PhonePlant getPhonePlant();
	ComputerPlant getComputerPlant();
}
