package cn.fuqiang.creational.PrototypePattern.cloneableInterface.deepClone;

import java.util.ArrayList;
import java.util.List;
/**
 * 测试 深度克隆 (对象中的引用类型属性也可以复制)
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
		SchoolClass obj = null;
		try {
			obj = (SchoolClass) super.clone();
			List<Student> old = this.getStudents();
			List<Student> newStudent = new ArrayList<>();
			for(Student student:old) {
				Student stu = student.clone();
				newStudent.add(stu);
			}
			obj.setStudents(newStudent);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
