package cn.fuqiang.creational.BuilderPattern;
/**
 * 建造者具体实现类
 * @author 王福强
 * @Title: ThinkPadBuilder.java 
 * @Package cn.fuqiang.creational.BuilderPattern
 * @Description  实现建造者抽象类中的方法，实现具体的创建方式
 * @date 2018年9月3日 下午4:16:53
 */
public class ThinkPadBuilder extends ComputerBuilder {
	private Computer computer = new Computer();
	@Override
	public void createComputerName() {
		computer.setName("ThinkPad");

	}

	@Override
	public void createComputerNo() {
		computer.setNo("T480");
	}

	@Override
	public void installComputerMainboard() {
		computer.setMainboard("华硕主板E-564B");
	}

	@Override
	public void installComputerMemoryBank() {
		computer.setMemoryBank("金士顿 8G内存");
	}

	@Override
	public void installComputerCpu() {
		computer.setCpu("i7-8514U");
	}

	@Override
	public void installComputerFan() {
		computer.setFan("炫光风扇");
	}

	@Override
	public void installComputerPowerSupply() {
		computer.setPowerSupply("福强牌超大电源");
	}
	
	@Override
	public void installComputerHardDisk() {
		computer.setHardDisk("128SSD");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

	
}
