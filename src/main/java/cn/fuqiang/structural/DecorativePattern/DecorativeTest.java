package cn.fuqiang.structural.DecorativePattern;

import java.io.*;

/**
 * 装饰模式  练习
 * @Author: 王福强
 * @Date: Created in 13:54 2018/9/19
 * @Email: bugwfq@163.com
 * @Description
 * 装饰(Decorative)模式又称包装(Wrapper)模式。装饰模式以对客户端透明的方式扩展对象的功能。是继承关系的一个替代方案。
 *      作用：不违背开闭原则的基础上，扩展或者撤销目标类的功能
 *      角色：
 *          抽象构件(接口)
 *          具体构件
 *          抽象装饰者(抽象类)
 *          具体装饰者
 *
 *     举例： java.io 包中的流
 *          抽象构件    InputStream
 *          具体构建    FileInputStream
 *          抽象装饰者  FilterInputStream
 *          具体装饰着  BufferedInputStream
 */
public class DecorativeTest {
    public static void main(String[] args) throws Exception {
        //原对象
        Component component = new ConcreteComponent();
        component.show();
        //装饰对象
        component = new ConcreteDecorator(component);
        component.show();
        //定义一个需要装饰的具体构件
        InputStream inputStream = new FileInputStream(new File("G:/wfq.txt"));
        /*
         * 定义缓冲流BufferedInputStream装饰InputStream
         * 其中缓冲流会将读取方式进行优化，减少磁盘的压力
        */
        InputStream bis = new BufferedInputStream(inputStream);
        int read = -1;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((read = bis.read())!=-1){
            bos.write(read);
        }
        bos.flush();
        bos.close();
        String s = new String(bos.toByteArray(),"UTF-8");
        System.out.println(s);
    }
}
