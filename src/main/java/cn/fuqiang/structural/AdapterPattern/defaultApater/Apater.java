package cn.fuqiang.structural.AdapterPattern.defaultApater;

/**
 * @Author: 王福强
 * @Date: Created in 16:59 2018/9/14
 * @Email: bugwfq@163.com
 * @Description
 */
public class Apater extends AbstractApater {
    private Apatee apatee;
    public Apater(Apatee apatee){
        this.apatee = apatee;
    }
    @Override
    public void method1() {
        apatee.method1();
    }

    @Override
    public void method2(){
        System.out.println("Apater 适配器类 方法 method2()");
    }
}
