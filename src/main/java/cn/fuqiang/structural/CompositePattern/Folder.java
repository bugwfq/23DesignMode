package cn.fuqiang.structural.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite（容器构件）
 * @Author: 王福强
 * @Date: Created in 10:15 2018/9/18
 * @Email: bugwfq@163.com
 * @Description
 * 它在组合节点中标识容器节点对象，容器节点包含子节点，其子节点可以是叶子节点，
 * 也可以是容器节点，它提供一个集合用于存储子节点，实现了在抽象构建中定义的行为，
 * 包括那些访问及管理子构件的方法，在其业务方法中可以递归调用其子节点的业务方法。
 *
 */
public class Folder extends IFile {
    private List<IFile> children;
    public Folder(String name){
        super(name);
        this.children = new ArrayList<>();
    }
    @Override
    public void add(IFile component) {
        for (IFile file : children){
            if(file.getName().equals(component.getName())){
                System.out.println("文件或文件夹已存在");
            }
        }
        children.add(component);
    }

    @Override
    public boolean remove(IFile component) {
        boolean remove = children.remove(component);
        return remove;
    }

    @Override
    public List<IFile> getChildren(IFile component) {
        return children;
    }

    @Override
    public void show(int level) {
        for(int i =0;i<level;i++){
            System.out.print("-");
        }
        System.out.println(getName());
        for (IFile file:children) {
            file.show(level+1);
        }
    }
}
