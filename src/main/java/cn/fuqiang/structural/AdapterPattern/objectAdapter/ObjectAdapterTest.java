package cn.fuqiang.structural.AdapterPattern.objectAdapter;

/**
 * 对象适配器
 * @Author: 王福强
 * @Date: Created in 15:23 2018/9/14
 * @Email: bugwfq@163.com
 * @Description
 * InperStreamReader就是一个适配器模式
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.method1();
        target.method2();
    }
}
