package com.base.commons;

import java.security.MessageDigest;

public class DeviceUtils {
    /**
     * md5加密
     * @return String md5s
     */
    public final static String MD5(String s)
    {
        try
        {
            byte[] Input = s.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(Input);
            // 获得密文
            byte[] md = mdInst.digest();
            StringBuffer hexValue = new StringBuffer();
            for (int i = 0; i < md.length; i++)
            {
                int val = (md[i]) & 0xff;
                if (val < 16)
                {
                    hexValue.append("0");
                }
                hexValue.append(Integer.toHexString(val));
            }
            return new String(hexValue.toString());
        }
        catch (Exception e)
        {
            return null;
        }
    }
}
