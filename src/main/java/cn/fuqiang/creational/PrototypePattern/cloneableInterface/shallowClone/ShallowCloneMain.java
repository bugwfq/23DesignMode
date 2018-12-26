package cn.fuqiang.creational.PrototypePattern.cloneableInterface.shallowClone;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式   浅克隆测试
 * @author 王福强
 * @Title: ShallowCloneMain.java 
 * @Package cn.fuqiang.PrototypePatter.cloneableInterface.shallowClone
 * @Description 
 * @date 2018年9月11日 上午11:15:23
 */
public class ShallowCloneMain {
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
		
		SchoolClass cClone1 = c.clone();
		System.out.println("班级"+c);
		System.out.println("克隆班级"+cClone1);
		System.out.println("是否为同一对象"+(c==cClone1));
		//比较原对象与克隆对象中的引用类型发现两个
		System.out.println("比较c中的引用类型与cClone1中的引用类型"+(c.getStudents()==cClone1.getStudents()));
	}
}
