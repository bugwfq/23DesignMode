package cn.fuqiang.structural.ProxyPattern.DynamicProxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 王福强
 * @Date: Created in 16:02 2018/9/26
 * @Email: bugwfq@163.com
 * @Description
 */
public enum LevelEnum {

    ROOT(0,"超级管理员"),
    ADMIN(1,"管理员"),
    USER(2,"用户")
    ;


    private Integer level;
    private String name;
    private static Map<Integer, LevelEnum> sonMap = new HashMap<>();
    static{
        LevelEnum[] values = LevelEnum.values();
        for (LevelEnum value:values) {
            sonMap.put(value.getLevel(),value);
        }
    }
    LevelEnum(Integer level, String name) {
        this.level = level;
        this.name = name;
    }

    public static String getNameByLevel(Integer level){
        return sonMap.get(level).getName();
    }
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
