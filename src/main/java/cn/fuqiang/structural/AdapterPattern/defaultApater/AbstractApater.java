package cn.fuqiang.structural.AdapterPattern.defaultApater;

/**
 * 缺省适配 模式
 * @Author: 王福强
 * @Date: Created in 16:55 2018/9/14
 * @Email: bugwfq@163.com
 * @Description
 * 缺省适配(Default Adapter)模式为一个接口提供缺省实现，
 * 这样子类型可以从这个缺省实现进行扩展，而不必从原有接口进行扩展。
 * 作为适配器模式的一个特例，缺省是适配模式在JAVA语言中有着特殊的应用。
 */
public abstract class AbstractApater  implements Target {
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }
}
