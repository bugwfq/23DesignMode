package cn.fuqiang.behavioral.ImmutablePattern.WeaklyImmutablePattern;

/**
 * 弱不变模式
 *  满足弱不变模式需要
 * @Author: 王福强
 * @Date: Created in 14:56 2018/12/29
 * @Email: bugwfq@163.com
 * @Description
 * 弱不变模式需要满足三点：
 *    1).当对象的构造子将对象初始化之后，对象的状态不再改变（也就是说不能有set方法再去修改状态）
 *    2).所有的属性度应该是私有的。不要声明任何公开的属性，以防客户端对象直接修改任何的内部状态。
 *    3).这个对象所引用到的其他对象如果是可变对象的话，必须设法限制外界对这些可变对象的访问，以防止外界修改这些对象。
 *   如果可能，应当尽量在不变对象的内部初始化这些被引用到的对象，而不要在客户端初始化，然后在传入到不变对象内部中来你，
 *   如果某个可变对象必须在客户端初始化，然后再传入到不变对象里的话，就应当考虑在不变对象初始化的时
 *   候将这个可变对象复制一份，而不要使用原来的拷贝。(可使用原型模式去复制)
 * 弱不变的缺点：
*     1).一个弱不变对象的子对象可以是可变对象；
*     2).这个可变的子对象可以修改父对象的状态；
 */
public class WIProduce {

    private Long id;
    private String name;
    private int level;

    public WIProduce(Long id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
}
