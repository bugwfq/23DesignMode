package cn.fuqiang.structural.AdapterPattern.objectAdapter;

/**
 * @Author: 王福强
 * @Date: Created in 15:25 2018/9/14
 * @Email: bugwfq@163.com
 * @Description
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void method1() {
        adaptee.method1();
    }

    @Override
    public void method2() {
        System.out.println("Adapter 适配器类  方法 method2()");
    }
}
