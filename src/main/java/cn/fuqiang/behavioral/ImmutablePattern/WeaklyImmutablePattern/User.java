package cn.fuqiang.behavioral.ImmutablePattern.WeaklyImmutablePattern;

/**
 * 引用对象
 * @Author: 王福强
 * @Date: Created in 10:33 2019/1/2
 * @Email: bugwfq@163.com
 * @Description
 * 练习不变模式中，引用对象处理方式的对象  (创建不变对象时一起初始化)
 */
public class User {
    private long id;
    private String name;
    private int age;
    private String addr;

    public User(long id, String name, int age, String addr) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
