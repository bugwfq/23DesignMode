package cn.fuqiang.structural.ProxyPattern.DynamicProxy;

import java.io.IOException;

/**
 * @Author: 王福强
 * @Date: Created in 18:55 2018/9/26
 * @Email: bugwfq@163.com
 * @Description 代理类除了是客户类和委托类的中介之外，我们还可以通过给代理类增加额外的功能来扩展委托类的功能，
 * 这样做我们只需要修改代理类而不需要再修改委托类，符合代码设计的开闭原则。
 * 代理类主要负责为委托类预处理消息、过滤消息、把消息转发给委托类，以及事后对返回结果的处理等。
 * 代理类本身并不真正实现服务，而是同过调用委托类的相关方法，来提供特定的服务。
 * 真正的业务功能还是由委托类来实现，但是可以在业务功能执行的前后加入一些公共的服务。
 * 例如我们想给项目加入缓存、日志这些功能，我们就可以使用代理类来完成，而没必要打开已经封装好的委托类。
 */
public class DynamicProxyTest {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setId(1000000000000L);
        user.setAge(10);
        user.setPassword("88888888");
        user.setName("王福强");
        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        IUserDao userDao = new UserDaoImpl();
        IUserDao proxy = (IUserDao) DynamicProxy.getProxy(userDao);
        System.out.println(proxy.add(user));
    }
}