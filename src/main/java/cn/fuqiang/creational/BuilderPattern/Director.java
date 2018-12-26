package cn.fuqiang.creational.BuilderPattern;

/**
 * 建造者模式的指挥者类
 * @author 王福强
 * @Title: Director.java 
 * @Package cn.fuqiang.creational.BuilderPattern
 * @Description  也就是指挥组装的过程
 * @date 2018年9月3日 下午5:24:58
 */
public class Director {
	private ComputerBuilder computerBuilder;
	public Director(ComputerBuilder computerBuilder) {
		this.computerBuilder = computerBuilder;
	}
	
	public Computer construct() {
		computerBuilder.createComputerName();
		computerBuilder.createComputerNo();
		computerBuilder.installComputerMainboard();
		computerBuilder.installComputerMemoryBank();
		computerBuilder.installComputerCpu();
		computerBuilder.installComputerFan();
		computerBuilder.installComputerPowerSupply();
		computerBuilder.installComputerHardDisk();
		return computerBuilder.getComputer();	
	}

}
