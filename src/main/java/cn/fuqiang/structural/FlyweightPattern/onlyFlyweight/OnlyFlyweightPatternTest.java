package cn.fuqiang.structural.FlyweightPattern.onlyFlyweight;

/**
 * 客户端角色
 * @Author: 王福强
 * @Date: Created in 16:57 2018/10/15
 * @Email: bugwfq@163.com
 * @Description
 */
public class OnlyFlyweightPatternTest {

    public static void main(String[] args) {
        FlyweightFactorySingleton factory = FlyweightFactorySingleton.getInstance();
        Flyweight a = factory.factory('a');
        Flyweight b = factory.factory('b');
        Flyweight a2 = factory.factory('a');
        Flyweight a3 = factory.factory('a');

        System.out.println("a b是否为相等："+ a==b+"");
        System.out.println("a a2是否为相等"+ a==a2+"");
        System.out.println("a a3是否为相等"+ a==a3+"");

        a.operation("黑体");
        b.operation("黑体");
        a2.operation("黑体加粗");
        a3.operation("黑体倾斜");
        System.out.println(OnlyFlyweightPatternTest.class.getResource("").getFile());

    }

}
