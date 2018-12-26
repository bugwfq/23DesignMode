package cn.fuqiang.structural.BridgePattern;

/**
 * 具体实现化(Concrete Implementor)
 * @Author: 王福强
 * @Date: Created in 16:25 2018/10/24
 * @Email: bugwfq@163.com
 * @Description
 * 这个角色给出实现化角色接口的具体实现。
 */
public class ConcreteImplementorA implements Implementor{

    @Override
    public void operationlmp() {
        System.out.println("ConcreteImplementorA   实现化角色接口的具体实现");
    }
}
