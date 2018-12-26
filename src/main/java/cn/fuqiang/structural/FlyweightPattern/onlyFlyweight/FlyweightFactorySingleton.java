package cn.fuqiang.structural.FlyweightPattern.onlyFlyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * @Author: 王福强
 * @Date: Created in 14:00 2018/10/17
 * @Email: bugwfq@163.com
 * @Description
 * 本角色负责创建和管理享元角色。本角色必须保证享元对象可以被系统适当的共享。当一个客户端对象调用一个享元对象时，
 * 享元角色会查看对象池中是非已经存在这个已有的享元对象。如果系统中没有一个适当的享元对象的话，享元工厂角色会创建
 * 一个新的对象。如果有的话则提供已存在的享元角色
 */
public class FlyweightFactorySingleton {
    /**
     * 存放享元对象的对象池
     */
    private Map<Character,Flyweight> flyweights = new HashMap<>();
    /**
     * 创建 工厂对象
     */
    private static FlyweightFactorySingleton singleton = new FlyweightFactorySingleton();

    private FlyweightFactorySingleton(){}

    /**
     * 返回 单例模式下的工厂对象
     * @return FlyweightFactory
     */
    public static FlyweightFactorySingleton getInstance(){
        return singleton;
    }

    /**
     * 根据传入的参数查看在工厂对象中是否已经存在该享元对象
     * 如果存在则返回已存在的对象，如果不存在则返回一个新创建的对象
     * 并把新创建的对象加入到对象池中
     * @param state
     * @return
     */
    public Flyweight factory(Character state){
        Flyweight newFlyweight;
        if(flyweights.containsKey(state)){
            newFlyweight = flyweights.get(state);
        }else{
            newFlyweight = new ConcreteFlyweight(state);
            flyweights.put(state,newFlyweight);
        }
        return newFlyweight;
    }
}
