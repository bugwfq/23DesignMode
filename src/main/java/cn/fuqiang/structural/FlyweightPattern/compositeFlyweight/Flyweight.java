package cn.fuqiang.structural.FlyweightPattern.compositeFlyweight;

/**
 * 抽象享元角色
 * @Author: 王福强
 * @Date: Created in 16:21 2018/10/16
 * @Email: bugwfq@163.com
 * @Description
 *  此角色是所有的具体享元类的超类，为这些类规定出需要实现的公共接口。那些需要外蕴(External State)
 *  的操作可以通过调用商业方法一参数形式传入
 */
public abstract class Flyweight {
    /**
     * 外蕴状态作为参量传入到方法中
     *
     * 这里的state就是外部状态
     * 是可以随外界环境变化而变化的
     * 比如说这是文字系统，state就可以是展示某一个字体的 其他属性，比如什么字体，或者是加粗加细等等
     * @param state
     */
    public abstract void operation(String state);
}
