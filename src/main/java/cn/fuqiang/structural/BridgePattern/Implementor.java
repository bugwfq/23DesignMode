package cn.fuqiang.structural.BridgePattern;

/**
 * 实现化(Implementor)角色 ： 行为实现类接口（Abstraction接口定义了基于Implementor接口的更高层次的操作）
 * @Author: 王福强
 * @Date: Created in 17:22 2018/10/23
 * @Email: bugwfq@163.com
 * @Description
 * 这个角色给出实现化角色的接口，但不给出具体的实现。必须指出的是，这个接口不一定和抽象化角色的接口定义相同，
 * 实际上，这两个接口可以非常不一样。是鲜花角色应当只是给出底层操作，而抽象化角色应当只给出基于底层操作的
 * 更高一层的操作
 */
public interface Implementor {
    /**
     * 某个商业方法的实现化声明
     * 必须由具体子类实现
     */
    void operationlmp();
}
