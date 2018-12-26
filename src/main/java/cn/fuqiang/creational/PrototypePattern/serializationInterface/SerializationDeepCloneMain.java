package cn.fuqiang.creational.PrototypePattern.serializationInterface;

import java.util.ArrayList;
import java.util.List;


/**
 * 深度克隆   对象序列化和反序列化实现
 * @author 王福强
 * @Title: SerializationDeepCloneMain.java 
 * @Package cn.fuqiang.PrototypePatter.serializationInterface
 * @Description 
 * @date 2018年9月11日 下午1:52:23
 */
public class SerializationDeepCloneMain {
	public static void main(String[] args) {
		//创建班级实体
		SchoolClass c = new SchoolClass();
		c.setcId(1L);
		c.setcName("英雄班");
		c.setRemark("这个班超屌哦！");
		List<Student> students = new ArrayList<>();
		Student student = new Student();
		student.setsId(1L);
		student.setsName("王二小");
		student.setAge(10);
		student.setAddr("召唤师峡谷");
		students.add(student);
		c.setStudents(students);

		SchoolClass cClone = c.clone();
		System.out.println("班级c"+c);
		System.out.println("克隆班级cClone"+cClone);
		System.out.println("班级c与克隆班级cClone是否引用统一地址存储"+(c==cClone));
		System.out.println("c与cClone中引用类型属性是否引用统一地址存储"+(c.getStudents()==cClone.getStudents()));
	}
}
