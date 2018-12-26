package cn.fuqiang.creational.BuilderPattern;

/**
 * 电脑建造者   抽象类
 * @author 王福强
 * @Title: ComputerBuilder.java 
 * @Package cn.fuqiang.creational.BuilderPattern
 * @Description 建造者抽象类定义装电脑的步骤，具体的安装方式由子类去实现
 * @date 2018年9月3日 下午4:06:49
 */
public abstract class ComputerBuilder {
	/**
	 * 创建电脑名称
	 */
	public abstract void createComputerName();
	/**
	 * 创建电脑型号
	 */
	public abstract void createComputerNo();
	/**
	 * 安装主板主板
	 */
	public abstract void installComputerMainboard();
	/**
	 * 安装内存条
	 */
	public abstract void installComputerMemoryBank(); 
	/**
	 * 安装处理器
	 */
	public abstract void installComputerCpu();
	
	/**
	 * 安装风扇
	 */
	public abstract void installComputerFan();
	
	/**
	 * 安装电源
	 */
	public abstract void installComputerPowerSupply();
	
	public abstract void installComputerHardDisk();
	/**
	 * 创建实体
	 * @author 王福强
	 * @Description 
	 * @date 2018年9月3日 下午5:12:56
	 * @return
	 */
	public abstract Computer getComputer();

}
