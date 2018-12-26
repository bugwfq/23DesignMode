package cn.fuqiang.creational.factoryPattern.abstractFactory;

public class Computer {
	/**
	 * cpu
	 */
	private String cpu;
	/**
	 * 主板(母版)
	 */
	private String motherBoard;
	/**
	 * 内存条
	 */
	private String memoryBank;
	
	/**
	 * 显卡
	 */
	private String graphicsCard;
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getMotherBoard() {
		return motherBoard;
	}
	public void setMotherBoard(String motherBoard) {
		this.motherBoard = motherBoard;
	}
	public String getMemoryBank() {
		return memoryBank;
	}
	public void setMemoryBank(String memoryBank) {
		this.memoryBank = memoryBank;
	}
	public String getGraphicsCard() {
		return graphicsCard;
	}
	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
	public String getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}
	/**
	 * 硬盘
	 */
	private String hardDisk;
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", motherBoard=" + motherBoard + ", memoryBank=" + memoryBank
				+ ", graphicsCard=" + graphicsCard + ", hardDisk=" + hardDisk + "]";
	}
	
}
