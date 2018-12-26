package cn.fuqiang.structural.AdapterPattern.classAdapter;


/**
 * 类适配器
 *
 * @Author: 王福强
 * @Date: Created in 11:15 2018/9/14
 * @Email: bugwfq@163.com
 * @Description
 * 适配器就是将一个类(a)通过某种方式转换成另一个类(b).
 * 是为了解决 接口不兼容 问题
 * 本例就是把Adaptee 转换成了Target
 *
 * InperStreamReader就是一个适配器模式
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        Target taget = new Adapter();
        taget.method1();
        taget.method2();
    }
}
