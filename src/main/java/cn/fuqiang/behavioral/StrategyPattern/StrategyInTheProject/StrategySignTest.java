package cn.fuqiang.behavioral.StrategyPattern.StrategyInTheProject;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 王福强
 * @Date: Created in 11:56 2019/4/19
 * @Email: bugwfq@163.com
 * @Description 校验sign策略测试
 */
public class StrategySignTest {
    public static void main(String[] args) {

        Map params = new HashMap();
        params.put("name","1");
        params.put("age","2");
        params.put("phone","3");
        params.put("sign","1221312123411111");
        String accessSecret = "AAA";
        SignUtil.validSign(params,accessSecret,new MD5Base64ValidSignImpl());
    }
}
