package cn.fuqiang.structural.ProxyPattern.StaticProxy;

/**
 * @Author: 王福强
 * @Date: Created in 18:40 2018/9/25
 * @Email: bugwfq@163.com
 * @Description
 */
public class UserDaoImpl implements IUserDao {
    @Override
    public boolean add(User user) {
        System.out.println("添加用户"+user);
        return false;
    }

    @Override
    public boolean delete(User user) {
        System.out.println("删除用户"+user);
        return false;
    }

    @Override
    public boolean update(User user) {
        System.out.println("修改用户"+user);
        return false;
    }

    @Override
    public User select(User user) {
        System.out.println("查看用户"+user);
        return user;
    }
}
