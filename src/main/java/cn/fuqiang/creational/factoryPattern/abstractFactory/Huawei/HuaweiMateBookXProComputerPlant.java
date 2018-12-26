package cn.fuqiang.creational.factoryPattern.abstractFactory.Huawei;

import cn.fuqiang.creational.factoryPattern.abstractFactory.Computer;
import cn.fuqiang.creational.factoryPattern.abstractFactory.ComputerPlant;

/**
 * 华为 mat book x pro
 * @author 王福强
 * @Title: HuaweiMateBookXProComputerPlant.java 
 * @Package cn.fuqiang.factory.abstractFactory
 * @Description 
 * @date 2018年7月20日 下午3:17:54
 */
public class HuaweiMateBookXProComputerPlant implements ComputerPlant {

	@Override
	public void packageComputer(Computer computer) {
		computer.setCpu("Intel 酷睿i5 8250U");
		computer.setGraphicsCard("性能级独立显卡");
		computer.setHardDisk("SSD固态硬盘");
		computer.setMemoryBank("LPDDR3（低功耗版）2133MHz");
		computer.setMotherBoard("Asus/华硕 A68HM-E AMD主板 支持FM2+ 集显核心 支持6600K 860");
	}
	
}
