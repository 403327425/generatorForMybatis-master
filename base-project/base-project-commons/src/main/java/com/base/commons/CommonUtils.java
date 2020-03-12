package com.base.commons;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.commons.net.util.Base64;

public class CommonUtils {


    public static String base64(String filePath){
        File file = new File(filePath);
//        byte[] b = new byte[1024];
        InputStream in = null;
        byte[] data = null;
        //读取图片字节数组
        try
        {
            in = new FileInputStream(file);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        String content = new String(Base64.encodeBase64(data));
        return content;
    }
}
