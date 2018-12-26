package cn.fuqiang.structural.AdapterPattern.classAdapter;

import java.util.Enumeration;

/**
 * 被适配者（Adaptee）
 * @Author: 王福强
 * @Date: Created in 11:46 2018/9/14
 * @Email: bugwfq@163.com
 * @Description
 */
public class Adaptee {
    public Adaptee(){
        System.out.println("被适配类创建");
    }
    public void method1(){
        System.out.println("Adptee 源类中本来就有的方法");
    }
}
