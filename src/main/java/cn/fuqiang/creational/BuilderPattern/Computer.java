package cn.fuqiang.creational.BuilderPattern;
/**
 * 电脑实体
 * @author 王福强
 * @Title: Computer.java 
 * @Package cn.fuqiang.creational.BuilderPattern
 * @Description 产品角色（一个具体的产品对象）
 * @date 2018年9月3日 下午3:00:40
 */
public class Computer {
	/**
	 * 电脑名称
	 */
	private String name;
	/**
	 * 电脑编号
	 */
	private String no;
	/**
	 * 内存条
	 */
	private String memoryBank; 
	/**
	 * 处理器
	 */
	private String cpu;
	/**
	 * 主板
	 */
	private String mainboard;
	
	/**
	 * 风扇
	 */
	private String fan;
	
	/**
	 * 电源
	 */
	private String powerSupply;
	
	/**
	 * 硬盘
	 */
	private String hardDisk;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getMemoryBank() {
		return memoryBank;
	}

	public void setMemoryBank(String memoryBank) {
		this.memoryBank = memoryBank;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getMainboard() {
		return mainboard;
	}

	public void setMainboard(String mainboard) {
		this.mainboard = mainboard;
	}

	public String getFan() {
		return fan;
	}

	public void setFan(String fan) {
		this.fan = fan;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}

	public String getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}

	@Override
	public String toString() {
		return "Computer [name=" + name + ", no=" + no + ", memoryBank=" + memoryBank + ", cpu=" + cpu + ", mainboard="
				+ mainboard + ", fan=" + fan + ", powerSupply=" + powerSupply + ", hardDisk=" + hardDisk + "]";
	}
	
}
