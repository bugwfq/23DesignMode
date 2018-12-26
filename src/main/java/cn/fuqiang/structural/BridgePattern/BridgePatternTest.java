package cn.fuqiang.structural.BridgePattern;

/**
 * 桥梁模式
 * @Author: 王福强
 * @Date: Created in 16:53 2018/10/24
 * @Email: bugwfq@163.com
 * @Description
 */
public class BridgePatternTest {
    public static void main(String[] args) {
        //定义
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();

    }

}
