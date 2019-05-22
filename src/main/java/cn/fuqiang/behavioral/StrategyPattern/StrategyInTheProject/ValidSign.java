package cn.fuqiang.behavioral.StrategyPattern.StrategyInTheProject;

import java.util.Map;

/**
 * @Author: 王福强
 * @Date: Created in 11:40 2019/4/11
 * @Email: bugwfq@163.com
 * @Description
 *  统一校验策略抽象接口
 *
 */
public interface ValidSign {
    /**
     *  不同的签名校验规则由具体的实现类去实现对应的策略
     * @return 校验结果
     */
    boolean validSign(Map params,String accessSecret);
}
