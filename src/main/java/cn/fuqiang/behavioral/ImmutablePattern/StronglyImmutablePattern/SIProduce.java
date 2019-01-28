package cn.fuqiang.behavioral.ImmutablePattern.StronglyImmutablePattern;


/**
 * @Author: 王福强
 * @Date: Created in 16:44 2019/1/28
 * @Email: bugwfq@163.com
 * @Description
 *强不变模式 strongly immutable pattern
 *     一个类的实例的状态不会改变，同时他的子类的实例也具有不可变化的状态。这样的类符合
 * 强不变模式。要实现强不变模式，一个类必须首先满足弱不变模式的所要求的所有条件，并且
 * 还要满足两个条件：
 *     1).所考虑的类所有的方法都应当是final，这样子类就不能够置换掉此类的方法。
 *     2).这个类本身就是final的，呢么这个类就不可能会有子类，从而也就不可能有被子类修改
 *     的问题。
 */
public final class SIProduce {
    private long id;
    private String name;
    private int level;
    private User user;

    public SIProduce(long id, String name, int level, User user) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.user = user.clone();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public long getUserId(){
        return this.user.getId();
    }
    public String getUserName(){
        return this.user.getName();
    }
    public int getUserAge(){
        return this.user.getAge();
    }
    public String getUserAddr(){
        return this.user.getAddr();
    }
    public String getUser(){
        return user.toString();
    }
}
