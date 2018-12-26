package cn.fuqiang.structural.FlyweightPattern;

/**
 *
 *
 * 享元模式 (Flyweight Pattern)
 * 在阎宏博士在《JAVA与模式》一书中开头是这样描述享元（Flyweight）模式的：
 *
 *     Flyweight在拳击比赛中指最轻量级，即“蝇量级”或“雨量级”，这里选择使用“享元模式”的意译，
 * 是因为这样更能反映模式的用意。享元模式是对象的结构模式。享元模式以共享的方式高效地支持大量的细粒度对象。
 *
 * 一、享元模式的用意
 *     享元对象能做到共享的关键是区分内蕴状态(Internal State)和外蕴状态(External State)。
 *     一个内蕴状态是存储在享元对象内部的，并且是不回随环境改变而有所不同的。因此，一个享元可以具有内蕴状态并可以共享。
 *     一个外蕴状态是随环境改变而改变的，不可以共享的状态。享元对象的外蕴状态必须由客户端保存，并在享元对象被创建之后，
 * 在需要使用的时候再传入到享元对象内部。
 *     外蕴状态不可以影响享元对象的内蕴状态。换句话说，他们是互相独立的。
 *
 * 二、享元模式的种类
 *     根据所涉及的享元对象内部表象，享元模式可以分成单纯享元模式和复合享元模式两种形式。
 *     在复合模式中，享元对象构成合成模式。因此，复合享元模式实际上是单纯享元模式与合成模式的组合。
 *
 *
 * 三、享元模式总结
 *      优点：
 *          1.可以极大减少内存中对象的数量，使用的相同或相似对象在内存中只保留一分，从而可以节约系统资源，
 *      提高系统性能。
 *          2.享元模式的外部状态相对独立，而且不会影响其内部状态，从而使得享元对象可以在不同得环境中被共享
 *      缺点：
 *          1.享元模式使得系统变得复杂，需要分离出内部状态和外部状态，这使得程序的逻辑复杂化。
 *          2.为了使用对象可以共享，享元模式需要将享元对象的部分状态外部化，而读取外部状态将使得运行时间边长
 *
 *      提示：
 *          内部状态：可以共享，不会随环境变化而改变
 *          外部状态：不可以共享，会随环境变化而改变
 *
 * 四、享元模式的应用
 *      String，Integer，Long都用到了享元模式
 *      比如 String a="abc";  String b="abc"; a==b  true (如果是new的String类型则为false)
 *
 *
 * @Author: 王福强
 * @Date: Created in 16:48 2018/10/17
 * @Email: bugwfq@163.com
 * @Description
 */
public class FlyweightPatterTxt {

    public static void main(String[] args) {
        /*
         * 测试String类型的享元模式
         */
        StringFlyweight();


        /**
         * 测试 Integer类型的享元模式
         */

        IntegerFlyweight();
    }

    /**
     * String 类型中的享元模式
     */
    public static void StringFlyweight(){
        //string类型的享元模式只在直接赋值的情况下才会用到
        String a = "abc";
        String b = "abc";
        System.out.println("a == b    "+(a==b));
        //如果用new 对象的话则相当于创建了两个新的对象，非享元模式
        String a1 = new String("abc");
        String b1 = new String("abc");



        System.out.println("a1 == b1    "+(a1==b1));
        /*
            intern方法能使一个位于堆中的字符串在运行期间动态的加入到字符串常量池中
            （字符串常量池的内容是程序启动的时候就已经加载好了），如果字符串常量池中有该对象对应的字面量，则返回该字面量在字符串常量池中的引用，否则，创建复制一份该字面量到字符串常量池并返回它的引用。
         */
        b1.intern();
        System.out.println("a == b1    "+(a==b1));
    }

    /**
     * Integer 类型中的享元模式
     */
    public static void IntegerFlyweight(){
        /*
         Integer 默认先创建并缓存 -128 ~ 127 之间数的 Integer 对象，当调用 valueOf 时如果参数在 -128 ~ 127 之间则计算下标并从缓存中返回，否则创建一个新的 Integer 对象
        (可以查看Integer源码)
         */
        Integer a = 127;
        Integer b = 127;
        System.out.println("a == b    "+(a==b)+"");
        /*
        反编译后可以发现 Integer a1 = 128; 实际变成了 Integer a1 = Integer.valueOf(128);，所以我们来看 Integer 中的 valueOf 方法的实现
         */
        Integer a1 = 128;
        Integer b1 = 128;
        System.out.println("a1 == b1    "+(a1==b1)+"");



    }
}
