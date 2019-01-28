package cn.fuqiang.behavioral.ImmutablePattern.StronglyImmutablePattern;

/**
 * 强不变模式的练习
 * @Author: 王福强
 * @Date: Created in 16:38 2019/1/28
 * @Email: bugwfq@163.com
 * @Description
 * 不变模式有很明显的优点：
 * 　（1）因为不能修改一个不变对象的状态，所以可以避免由此引起的不必要的程序错误；换言之，一个不变的对象要比可变的对象更加容易维护。
 * 　（2）因为没有任何一个线程能够修改不变对象的内部状态，一个不变对象自动就是线程安全的，这样就可以省掉处理同步化的开销。一个不变对象可以自由地被不同的客户端共享。
 * 强不变模式唯一的缺点是：
 *     一旦需要修改一个不变对象的状态，就只好创建一个新的同类对象。在需要频繁修改不变对象的环境里，会有大量的不变对象作为中间结果被创建出来，再被JAVA垃圾收集器收集走。这是一种资源上的浪费。
 *    　在设计任何一个类的时候，应当慎重考虑其状态是否有需要变化的可能性。除非其状态有变化的必要，不然应当将它设计成不变类。
 */
public class StronglyImmutableTest {
    public static void main(String[] args) {
        //强不变模式(在这里我们练习一下不变模式中说的,如果引用对象非要在外边初始化，则需要在不变对象中留一个副本，而不是引用原地址)
        User user = new User(1L,"老王",1,"深圳");
        SIProduce siProduce = new SIProduce(1L,"强不变",1,user);
        user.setName("老李");
        //会发现原对象中修改了，不会影响不变对象中的内容
        System.out.println(siProduce.getUserName()+"--"+user.getName());
        //因为是创建的副本，不是同一个堆内存
        System.out.println(user.toString()+"--"+siProduce.getUser());
    }
}
