package cn.fuqiang.behavioral.StrategyPattern.StrategyInTheProject;

import sun.security.provider.MD5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * @Author: 王福强
 * @Date: Created in 10:51 2019/4/17
 * @Email: bugwfq@163.com
 * @Description 简单的 MD5Base64方式策略校验类具体实现
 */
public class MD5Base64ValidSignImpl implements ValidSign {
    /**
     * 实现策略方法
     * @param params  请求的参数
     * @return         校验结果
     */
    @Override
    public boolean validSign(Map params,String accessSecret) {
        String sign = (String) params.get("sign");
        if(sign != null && sign.trim().length()>0){
            String createSign = createSign(params, accessSecret);
            return sign.equals(createSign);
        }
        return false;
    }
    public String createSign(Map params,String accessSecret){
        SortedSet set = new TreeSet( params.keySet());
        StringBuffer sb = new StringBuffer();
        for (Iterator iter = set.iterator() ; iter.hasNext();){
            Object key = iter.next();
            if(key!=null && !"sign".equals(key.toString())){
                sb.append(key+"="+params.get(key)+"&");
            }
        }
        sb.append("accessSecret="+accessSecret);
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return new String(Base64.getEncoder().encode(md.digest(sb.toString().getBytes()))).toUpperCase();
    }
}
