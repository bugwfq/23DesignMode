package cn.fuqiang.structural.FacadePattern;

/**
 * 门面(Facade)角色
 *
 * @Author: 王福强
 * @Date: Created in 11:40 2018/10/23
 * @Email: bugwfq@163.com
 * @Description
 * 客户端可以调用这个角色的方法。此角色知晓相关的（一个或者多个）子系统的功能和责任。
 * 在正常情况下，本角色会将所有从客户端发来的请求委派到相应的子系统去。
 */
public class Facade {
    private Model1 model1;
    private Model2 model2;
    private Model3 model3;
    private Facade(){
        model1 = new Model1();
        model2 = new Model2();
        model3 = new Model3();
    }
    private static Facade facade = new Facade();
    public static Facade getInstance(){
        return facade;
    }
    public void start(){
        model1.start();
        model2.start();
        model3.start();
    }
    public void close(){
        model1.close();
        model2.close();
        model3.close();
    }
}
