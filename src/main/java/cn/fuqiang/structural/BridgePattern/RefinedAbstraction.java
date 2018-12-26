package cn.fuqiang.structural.BridgePattern;

/**
 * 修正抽象化（Refined Abstraction）角色
 * @Author: 王福强
 * @Date: Created in 15:57 2018/10/24
 * @Email: bugwfq@163.com
 * @Description
 * 扩展抽象化角色，改变和修正父类对抽象化的定义。
 * 也就是桥梁的具体实现
 */
public class RefinedAbstraction extends Abstraction{

    /**
     * 某个商业方法在修正抽象化角色的实现
     * @param implementor
     */
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
        System.out.println("对功能进行了扩展");
    }
}
