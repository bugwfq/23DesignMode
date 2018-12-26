package cn.fuqiang.creational.factoryPattern.abstractFactory.XiaoMI;

import cn.fuqiang.creational.factoryPattern.abstractFactory.Computer;
import cn.fuqiang.creational.factoryPattern.abstractFactory.ComputerPlant;
/**
 * 小米电脑制造工厂
 * @author 王福强
 * @Title: XiaoMiAirComputerPlant.java 
 * @Package cn.fuqiang.creational.factoryPattern.abstractFactory.XiaoMI
 * @Description 
 * @date 2018年9月4日 下午2:45:28
 */
public class XiaoMiAirComputerPlant implements ComputerPlant {

	@Override
	public void packageComputer(Computer computer) {
		computer.setCpu("Intel 酷睿i5 6200U");
		computer.setGraphicsCard("NVIDIA GeForce 940MX");
		computer.setHardDisk("128SSD");
		computer.setMemoryBank("16G");
		computer.setMotherBoard("华硕主板主板");
	}

}
