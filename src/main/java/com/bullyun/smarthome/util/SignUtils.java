package com.bullyun.smarthome.util;

import java.io.IOException;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SignUtils {

    public static String getSignature(HashMap<String, String> params) throws IOException {

        // 先将参数以其参数名的字典序升序进行排序
        Map<String, String> sortedParams = new TreeMap<String, String>(params);
        Set<Entry<String, String>> entrys = sortedParams.entrySet();

        // 遍历排序后的字典，将所有参数按"key=value"格式拼接在一起
        StringBuilder basestring = new StringBuilder();
        for (Entry<String, String> param : entrys) {
            basestring.append(param.getKey()).append("=").append(param.getValue()).append("&");
        }
        //basestring.append(secret);
        StringBuilder s = basestring.deleteCharAt(basestring.lastIndexOf("&"));
        //System.out.println(s.toString());

        String str = URLEncoder.encode(s.toString());
        //System.out.println(str);
        // 使用MD5对待签名串求签
        byte[] bytes = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            // URLEncoder.encode(basestring.toString());
            //bytes = md5.digest(basestring.toString().getBytes("UTF-8"));
            bytes = md5.digest(str.getBytes());
        } catch (GeneralSecurityException ex) {
            throw new IOException(ex);
        }

        // 将MD5输出的二进制结果转换为小写的十六进制
        StringBuilder sign = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(bytes[i] & 0xFF);
            if (hex.length() == 1) {
                sign.append("0");
            }
            sign.append(hex);
        }
        return sign.toString();
    }

}
