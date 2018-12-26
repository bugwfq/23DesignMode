package cn.fuqiang.structural.DecorativePattern;



/**
 * @Author: 王福强
 * @Date: Created in 16:05 2018/9/19
 * @Email: bugwfq@163.com
 * @Description 被装饰对象
 */
public class ConcreteComponent implements Component {
    @Override
    public void show() {
        System.out.println("ConcreteComponet  show()方法");
    }
}
