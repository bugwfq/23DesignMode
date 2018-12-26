package cn.fuqiang.structural.ProxyPattern.DynamicProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * @Author: 王福强
 * @Date: Created in 16:35 2018/9/26
 * @Email: bugwfq@163.com
 * @Description
 */
public class DynamicProxy {

    /**
     *  通过 Proxy 类中的静态 newProxyInstance方法  用来返回java动态代理生成的代理对象
     * @param obj
     * @return
     */
    public static Object getProxy(Object obj){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),new DynamicProxySon(obj));
    }

    /**
     * 实现处理器InvocationHandler接口
     * （也就是代理的详细方法）
     */
    private static class DynamicProxySon implements  java.lang.reflect.InvocationHandler{
        public  Object obj;
        public DynamicProxySon(Object obj){
            this.obj = obj;
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if(isLogin()){
                System.out.println("登录成功");
                return method.invoke(obj, args);
            }
            System.out.println("无权限");
            return false;
        }
    }
    private static boolean isLogin() {
        return false;
    }
}
