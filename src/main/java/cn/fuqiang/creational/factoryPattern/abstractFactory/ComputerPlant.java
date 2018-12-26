package cn.fuqiang.creational.factoryPattern.abstractFactory;
/**
 * 电脑车间超类  要生产指定型号的电脑就创建制定的生产车间
 * @author 王福强
 * @Title: ComputerPlant.java 
 * @Package cn.fuqiang.factory.abstractFactory
 * @Description 
 * @date 2018年7月20日 下午3:12:52
 */
public interface ComputerPlant {
	/**
	 * 安装电脑的方法
	 * @author 王福强
	 * @Description 
	 * @date 2018年9月4日 下午2:05:43
	 * @param computer
	 */
	void packageComputer(Computer computer);
}
