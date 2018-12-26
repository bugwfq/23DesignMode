package cn.fuqiang.creational.PrototypePattern.serializationInterface;

import java.io.Serializable;

/**
 * 学生实体      要重写clone方法必须实现Cloneable 该对象才能被克隆
 *   
 * @author 王福强
 * @Title: Student.java 
 * @Package cn.fuqiang.PrototypePatter.cloneableInterface
 * @Description 
 * @date 2018年9月11日 上午10:36:46
 */
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long sId;
	private String sName;
	private Integer age;
	private String addr;
	
	public Long getsId() {
		return sId;
	}
	public void setsId(Long sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Student clone() {
		Student stu = ObjectSerialization.clone(this);
		return stu;
	}
}
