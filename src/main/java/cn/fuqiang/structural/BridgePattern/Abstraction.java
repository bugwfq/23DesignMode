package cn.fuqiang.structural.BridgePattern;

/**
 * 抽象化(Abstraction)角色
 * @Author: 王福强
 * @Date: Created in 17:14 2018/10/23
<<<<<<< HEAD
 * @Email: bugwfq@163.com
 * @Description
 * 抽象化给出的定义，并保存一个对实现化对象的引用
 * 也就是  抽象的桥
=======
 * @Email:  bugwfq@163.com
 * @Description
 * 抽象化给出的定义，并保存一个对实现化对象的引用
 * 也就是   抽象的桥
>>>>>>> 71230477f8a1762f86ecb630561d9da8ce25dc62
 */
public abstract class Abstraction {
    /**
     * 实现化抽象类
     */
    private Implementor implementor;

    public Abstraction (Implementor implementor){
        this.implementor = implementor;
    }

    public void operation(){
        implementor.operationlmp();
    }
}
