package cn.fuqiang.structural.ProxyPattern.StaticProxy;

/**
 * @Author: 王福强
 * @Date: Created in 18:37 2018/9/25
 * @Email: bugwfq@163.com
 * @Description
 */
public interface IUserDao {
    boolean add(User user);
    boolean delete(User user);
    boolean update(User user);
    User select(User user);
}
