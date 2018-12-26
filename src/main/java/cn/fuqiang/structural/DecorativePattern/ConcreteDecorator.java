package cn.fuqiang.structural.DecorativePattern;

/**
 * @Author: 王福强
 * @Date: Created in 16:53 2018/9/19
 * @Email: bugwfq@163.com
 * @Description 具体装饰对象
 */
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void show() {
        System.out.println("添加 ConcreteDecorator show()功能");
        super.show();
    }
}
