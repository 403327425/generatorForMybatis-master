package com.base.commons;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import java.util.Date;

public class JSONUtils {

    public static String object2Str(Object o){
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
        JSONObject jsonObject = new JSONObject();
        jsonObject = JSONObject.fromObject(o,jsonConfig);
        return jsonObject.toString();
    }
}
