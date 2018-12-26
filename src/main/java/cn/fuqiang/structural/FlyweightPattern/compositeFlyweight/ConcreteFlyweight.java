package cn.fuqiang.structural.FlyweightPattern.compositeFlyweight;

/**
 * 具体享元(ConcreteFlyweight)角色
 * @Author: 王福强
 * @Date: Created in 16:23 2018/10/16
 * @Email: bugwfq@163.com
 * @Description
 * 实现抽象享元角色所规定的接口。如果有内蕴状态的话，必须负责为内蕴状态提供存储空间。
 * 享元对象的内蕴状态必须与对象所处的周围环境无关，从而使得享元对象可以在系统内共享的。
 */
public class ConcreteFlyweight extends Flyweight {
    /**
     * 内蕴：也就是内部状态，该状态不会随环境的变化而改变
     */
    private Character initState;
    private int count;
    public ConcreteFlyweight(Character state){
        initState = state;
        count=1;
    }

    /**
     *外蕴：也就是外部状态，会随着环境的变化而变化所以需要外部传入
     * @param state
     */
    @Override
    public synchronized void operation(String state) {
        System.out.println("外部状态："+state+"\n内部状态"+initState+"\n被调用次数"+count++);
    }

    public Character getInitState() {
        return initState;
    }

    public void setInitState(Character initState) {
        this.initState = initState;
    }
}
