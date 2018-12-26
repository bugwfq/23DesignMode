package cn.fuqiang.structural.CompositePattern;

/**
 * 组合模式的测试
 * @Author: 王福强
 * @Date: Created in 10:41 2018/9/18
 * @Email: bugwfq@163.com
 * @Description
 *   组合模式的关键是定义了一个抽象构件类，它既可以代表叶子，
 *   又可以代表容器，而客户端针对该抽象构件类进行编程，
 *   无须知道它到底表示的是叶子还是容器，可以对其进行统一处理。
 *   同时容器对象与抽象构件类之间还建立一个聚合关联关系，
 *   在容器对象中既可以包含叶子，也可以包含容器，以此实现递归组合，
 *   形成一个树形结构。
 */
public class FileTest {
    public static void main(String[] args) {
        Folder folder = new Folder("C");
        Folder cTxt = new Folder("cTxt.txt");
        folder.add(cTxt);
        Folder wfq1 = new Folder("wfq1");
        folder.add(wfq1);
        Folder wfq11 = new Folder("wfq11");
        wfq1.add(wfq11);
        Folder wfq111 = new Folder("wfq111");
        wfq11.add(wfq111);
        File wfqTxt1 = new File("wfq111Txt1.txt");
        wfq111.add(wfqTxt1);
        Folder wfq2 = new Folder("wfq2");
        folder.add(wfq2);
        folder.show(0);
    }
}
