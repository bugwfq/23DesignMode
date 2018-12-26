package cn.fuqiang.structural.CompositePattern;

/**
 * Leaf(叶子构件)
 * @Author: 王福强
 * @Date: Created in 10:22 2018/9/18
 * @Email: bugwfq@163.com
 * @Description 它在组合结构中表示叶子节点对象，叶子节点没有子节点，
 * 它实现了在抽象构件中定义的行为。
 * 对于那些访问及管理子构件的方法，可以通过异常等方式进行处理。
 */
public class File extends IFile {
    public File(String name ){
        super(name);
    }

    @Override
    public void show(int level) {
        for(int i =0;i<level;i++){
            System.out.print("-");
        }
        System.out.println(getName());
    }
}
