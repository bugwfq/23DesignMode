package cn.fuqiang.structural.FlyweightPattern.compositeFlyweight;

import java.util.HashMap;
import java.util.Set;

/**
 *复合享元
 * @Author: 王福强
 * @Date: Created in 14:28 2018/10/19
 * @Email: bugwfq@163.com
 * @Description
 * 复合享元角色所代表的对象是不可以共享的，但是一个复合享元对象可以分解成为多个本身是单纯享元对象的组合。
 * 复合享元角色又称作不可共享的享元的对象
 *
 */
public class ConcreteCompositeFlyweight extends Flyweight {

    private HashMap<Character,Flyweight> concreteFlyweightMap = new HashMap<>();

    public void add(Character key,Flyweight flyweight ){
        concreteFlyweightMap.put(key,flyweight);
    }
    @Override
    public void operation(String state) {
        Set<Character> characters = concreteFlyweightMap.keySet();
        for (Character key:characters) {
            Flyweight flyweight = concreteFlyweightMap.get(key);
            flyweight.operation(state);
        }

    }
}
