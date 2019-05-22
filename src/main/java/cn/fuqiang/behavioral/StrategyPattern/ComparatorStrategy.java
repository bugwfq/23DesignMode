package cn.fuqiang.behavioral.StrategyPattern;

import com.google.common.collect.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: 王福强
 * @Date: Created in 16:39 2019/4/9
 * @Email: bugwfq@163.com
 * @Description 针对JDK中的策略模式剖析
 *  策略模式最好的例子就是我们常用到的排序策略
 *  Collections.sort(List<T> list, Comparator<? super T> c) 当我们传入需要排序的数组，和我们实现的排序策略对象
 *  就会按照我们实现的方式去进行排序
 *
 *  Collections 为环境
 *  Comparator  为抽象策略
 *  ComparaByUserAge和ComparaByUserName  是我们实现的具体策略类
 *
 *
 *
 */
public class ComparatorStrategy {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        User zs = new User(28,"zs");
        User ls = new User(18,"ls");
        User w5 = new User(20,"w5");
        User z6 = new User(17,"z6");
        list.add(zs);list.add(ls);list.add(w5);list.add(z6);
        System.out.println("原数组"+list);
        //年龄排序
        Collections.sort(list,new ComparaByUserAge());
        System.out.println("年龄排序数组"+list);
        //姓名排序
        Collections.sort(list,new ComparaByUserName());
        System.out.println("姓名排序数组"+list);
        /*
        打印结果
        原数组[User{age=28, name='zs'}, User{age=18, name='ls'}, User{age=20, name='w5'}, User{age=17, name='z6'}]
        年龄排序数组[User{age=17, name='z6'}, User{age=18, name='ls'}, User{age=20, name='w5'}, User{age=28, name='zs'}]
        姓名排序数组[User{age=18, name='ls'}, User{age=20, name='w5'}, User{age=17, name='z6'}, User{age=28, name='zs'}]
         */
    }
}

/**
 * 需要比较的对象
 */
class User
{
    int age;
    String name;
    User(int age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

/**
 * 实现抽象策略接口  按照年龄排序策略
 */
class ComparaByUserAge implements Comparator<User>{
    @Override
    public int compare(User o1, User o2) {
        return o1.age-o2.age ;
    }
}

/**
 * 实现抽象策略接口  按照名称排序策略
 */
class ComparaByUserName implements Comparator<User>{
    @Override
    public int compare(User o1, User o2) {
        return o1.name.compareTo(o2.name) ;
    }
}