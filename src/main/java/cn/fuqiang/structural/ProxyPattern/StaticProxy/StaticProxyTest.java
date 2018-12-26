package cn.fuqiang.structural.ProxyPattern.StaticProxy;

/**
 * @Author: 王福强
 * @Date: Created in 18:03 2018/9/25
 * @Email: bugwfq@163.com
 * @Description
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1000000000000L);
        user.setAge(10);
        user.setPassword("88888888");
        user.setName("王福强");

        IUserDao userDao = new UserDaoImpl();
        IUserDao proxyD = new LoginProxy(userDao,0);
        proxyD.add(user);
        proxyD.delete(user);
        proxyD.update(user);
        proxyD.select(user);
    }
}
