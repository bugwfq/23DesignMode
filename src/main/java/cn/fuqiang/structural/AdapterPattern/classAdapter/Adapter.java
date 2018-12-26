package cn.fuqiang.structural.AdapterPattern.classAdapter;

/**
 * 适配器类(Adapter)角色
 * @Author: 王福强
 * @Date: Created in 13:39 2018/9/14
 * @Email: bugwfq@163.com
 * @Description
 */
public class Adapter extends Adaptee implements Target{
    public Adapter(){
        System.out.println("适配器类创建");
    }
    @Override
    public void method2() {
        System.out.println("Adapter 适配器类，补充源类没有的方法");
    }
}
