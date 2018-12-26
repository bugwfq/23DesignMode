package cn.fuqiang.structural.ProxyPattern.StaticProxy;

/**
 * @Author: 王福强
 * @Date: Created in 10:08 2018/9/26
 * @Email: bugwfq@163.com
 * @Description
 */
public class LoginProxy implements IUserDao{
    private IUserDao userDao;
    private Integer level = -1;
    public LoginProxy(IUserDao userDao, Integer level){
        this.userDao = userDao;
        this.level = level;
    }
    @Override
    public boolean add(User user) {
        if(isLogin()){
            System.out.println(LevelEnum.getNameByLevel(level)+"登录成功");
          return userDao.add(user);
        }
        System.out.println("无权限");
        return false;
    }
    public boolean isLogin(){
        if(level.equals(LevelEnum.ROOT.getLevel()) ||level.equals(LevelEnum.ADMIN.getLevel())|| level.equals(LevelEnum.USER.getLevel())){
            return true;
        }
        return false;
    }
    @Override
    public boolean delete(User user) {
        if(isLogin()){
            System.out.println(LevelEnum.getNameByLevel(level)+"登录成功");
            return userDao.delete(user);
        }
        System.out.println("无权限");
        return false;
    }

    @Override
    public boolean update(User user) {
        if(isLogin()){
            System.out.println(LevelEnum.getNameByLevel(level)+"登录成功");
            return userDao.update(user);
        }
        System.out.println("无权限");
        return false;
    }

    @Override
    public User select(User user) {
        return user;
    }

}
