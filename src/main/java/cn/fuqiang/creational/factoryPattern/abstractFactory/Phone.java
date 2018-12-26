package cn.fuqiang.creational.factoryPattern.abstractFactory;

public class Phone {
	/**
	 * 型号
	 */
	private String version;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * cpu
	 */
	private String cpu;
	/**
	 * 屏幕
	 */
	private String screen;
	/**
	 * 电池
	 */
	private String battery;
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Phone [version=" + version + ", name=" + name + ", cpu=" + cpu + ", screen=" + screen + ", battery="
				+ battery + "]";
	}
	
}
