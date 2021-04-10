package com.qiujie.jzb.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
    /**
     * 十六进制下数字到字符的映射数组
     */
    private final static String[] HEX_DIGITS = {"0", "1", "2", "3", "4",
            "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    /**
     * md5加密算法
     * @param  originString 待加密字符串
     * @return 加密后的字符串
     */
    public static String encodeByMD5(String originString) throws NoSuchAlgorithmException {
        if (originString != null){
            //创建具有指定算法名称的信息摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            //使用指定的字节数组对摘要进行最后更新，然后完成摘要计算
            byte[] results = md.digest(originString.getBytes());
            //将得到的字节数组变成字符串返回
            String resultString = byteArrayToHexString(results);
            return resultString.toUpperCase();
        }
        return null;
    }

    /**
     * 转换字节数组为十六进制字符串
     * @param
     * @return    十六进制字符串
     */
    private static String byteArrayToHexString(byte[] b){
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++){
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    /** 将一个字节转化成十六进制形式的字符串     */
    private static String byteToHexString(byte b){
        int n = b;
        if (n < 0) {
            n = 256 + n;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return HEX_DIGITS[d1] + HEX_DIGITS[d2];
    }

    /**
     * 验证
     * @param sourceString
     * @param encodingString
     * @return
     */
    public static boolean verify(String sourceString , String encodingString) throws NoSuchAlgorithmException {
        if(sourceString == null || encodingString == null) {
            return false;
        }
        return encodingString.equals(encodeByMD5(sourceString));
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(MD5Util.encodeByMD5("123456"));
    }
}

