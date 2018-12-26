package cn.fuqiang.structural.DecorativePattern;

/**
 * @Author: 王福强
 * @Date: Created in 16:32 2018/9/19
 * @Email: bugwfq@163.com
 * @Description 抽象装饰对象
 */
public abstract class Decorator implements Component{
    protected Component component;
    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void show() {
        component.show();
    }
}
