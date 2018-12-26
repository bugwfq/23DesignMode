package cn.fuqiang.creational.PrototypePattern.cloneableInterface.shallowClone;

import java.util.List;
/**
 * 测试 浅 克隆 (只复制基本类型，引用类型 只复制地址)
 * @author 王福强
 * @Title: SchoolClass.java 
 * @Package cn.fuqiang.PrototypePatter.cloneableInterface.shallowClone
 * @Description 
 * @date 2018年9月11日 上午11:11:19
 */
public class SchoolClass implements Cloneable{
	private Long cId;
	private String cName;
	private String remark;
	private List<Student> students;
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public SchoolClass clone() {
		Object obj = null;
		try {
			obj = super.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (SchoolClass)obj;
	}
}
