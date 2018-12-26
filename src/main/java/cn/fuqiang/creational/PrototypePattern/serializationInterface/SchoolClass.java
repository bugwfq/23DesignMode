package cn.fuqiang.creational.PrototypePattern.serializationInterface;

import java.io.Serializable;
import java.util.List;
/**
 * 测试 深度克隆 (使用对象的序列化与发序列化实现深度克隆)
 * @author 王福强
 * @Title: SchoolClass.java 
 * @Package cn.fuqiang.PrototypePatter.cloneableInterface.shallowClone
 * @Description 
 * @date 2018年9月11日 上午11:11:19
 */
public class SchoolClass implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		SchoolClass obj = ObjectSerialization.clone(this);
		return obj;
	}
}
