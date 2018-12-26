package cn.fuqiang.structural.FlyweightPattern.compositeFlyweight;

/**
 * 复合享元模式测试
 * @Author: 王福强
 * @Date: Created in 9:50 2018/10/16
 * @Email: bugwfq@163.com
 * @Description
 *  在单纯享元模式中，所有的享元对象都是单纯享元对象，也就是说都市可以直接共享的。
 *  下面考虑一个较为复杂的情况，即将一些单纯享元使用合成模式加以复合，形成复合享元对象。
 *  这样的复合享元对象本身不能共享，但是它们可以分解成单纯享元对象，而分解后的单纯享元对象是可以共享的。
 */
public class CompositeFlyweightPattern {
    public static void main(String[] args) {
        FlyweightFactory factory = FlyweightFactory.getInstance() ;
        Flyweight aba = factory.factory("aba");
        aba.operation("粗体");
    }
}
