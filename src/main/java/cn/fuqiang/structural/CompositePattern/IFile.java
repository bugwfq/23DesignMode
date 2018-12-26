package cn.fuqiang.structural.CompositePattern;

import java.util.List;

/**
 * Component(抽象构件)
 * @Author: 王福强
 * @Date: Created in 17:45 2018/9/17
 * @Email: bugwfq@163.com
 * @Description
 * 它可以是接口或抽象类，为叶子构建和容器构建对象声明接口，
 * 在该角色中可以包含所有子类共有行为的什么和实现。在抽象构建中定义了访问及其管理它的子构件的方法，
 * 如增加子构件的方法，如增加子构件，删除子构件，获取子构件等
 */
public abstract class IFile {
    private String name;
    public IFile(String name){
        this.name = name;
    }

    public void add(IFile component) throws Exception{
        throw new Exception("当前节点无法添加子节点");
    }
    public boolean remove(IFile component)throws Exception{
        throw new Exception("当前节点无子节点");
    }
    public List<IFile> getChildren(IFile component) throws Exception{
        throw new Exception("当前节点无子节点");
    }

    public abstract void show(int level);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
