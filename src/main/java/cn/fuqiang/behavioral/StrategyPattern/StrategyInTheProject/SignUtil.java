package cn.fuqiang.behavioral.StrategyPattern.StrategyInTheProject;

import org.apache.commons.exec.util.MapUtils;

import java.util.Map;

/**
 * @Author: 王福强
 * @Date: Created in 14:58 2019/4/19
 * @Email: bugwfq@163.com
 * @Description 策略的环境
 */
public class SignUtil {
    public static boolean validSign(Map params, String accessSecret,ValidSign validSign){
        return validSign.validSign(params,accessSecret);
    }
}
