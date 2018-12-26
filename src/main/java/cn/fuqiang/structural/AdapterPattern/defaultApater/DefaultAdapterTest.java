package cn.fuqiang.structural.AdapterPattern.defaultApater;

import java.io.*;

/**
 * 缺省适配器
 * @Author: 王福强
 * @Date: Created in 17:05 2018/9/14
 * @Email: bugwfq@163.com
 * @Description
 * InperStreamReader就是一个适配器模式
 */
public class DefaultAdapterTest {
    public static void main(String[] args) throws FileNotFoundException {
        Apatee apatee = new Apatee();
        Target target = new Apater(apatee);
        target.method1();
        target.method2();
        //将InputStream
        InputStream fileInputStream = new FileInputStream(new File("G:/wfq.txt"));
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
    }
}
