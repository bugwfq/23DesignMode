package cn.fuqiang.structural.FacadePattern;

/**
 * 门面模式(外观模式) Facade Pattern
 * @Author: 王福强
 * @Date: Created in 11:34 2018/10/23
 * @Email: bugwfq@163.com
 * @Description
 *
 *      门面模式是对象的结构模式。外部与一个子系统的通信必须通过一个统一的门面（Facade）对象进行。
 * 门面模式提供一个高层次的接口，使得子系统更易于使用。
 * 这就是门面模式
 *
 */
public class FacadePatternTest {
    public static void main(String[] args) {
        /**
         * 统一的门面（Facade）对象进行。
         */
        Facade facade = Facade.getInstance();
        facade.start();
        facade.close();
    }
}
