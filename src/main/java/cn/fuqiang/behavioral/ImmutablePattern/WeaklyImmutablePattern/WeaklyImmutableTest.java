package cn.fuqiang.behavioral.ImmutablePattern.WeaklyImmutablePattern;

/**
 * 弱不变模式练习
 * @Author: 王福强
 * @Date: Created in 2018 12/29
 * @Email: bugwfq@163.com
 * @Description
 *不变模式有很明显的优点：
 * 　（1）因为不能修改一个不变对象的状态，所以可以避免由此引起的不必要的程序错误；换言之，一个不变的对象要比可变的对象更加容易维护。
 * 　（2）因为没有任何一个线程能够修改不变对象的内部状态，一个不变对象自动就是线程安全的，这样就可以省掉处理同步化的开销。一个不变对象可以自由地被不同的客户端共享。
 *弱不变模式的缺点：
 *  1).一个弱不变对象的子对象可以是可变对象；
 *   2).这个可变的子对象可以修改父对象的状态；
 * */
public class WeaklyImmutableTest {
    public static void main(String[] args) {
        //弱不变模式  （虽然现在这些属性初始化后无法去修改，但是如果有子类去继承该类则这些不可变都可以改为可变）
        WIProduce wiProduce = new WIProduce(1L,"不变",0,1L,"老王",18,"test");
        wiProduce.getId();
        wiProduce.getName();
        wiProduce.getLevel();
        wiProduce.getUserId();
        wiProduce.getUserName();
        wiProduce.getUserAge();
        wiProduce.getUserAddr();
        //现在如果我们要修改只能重新new了

    }
}
