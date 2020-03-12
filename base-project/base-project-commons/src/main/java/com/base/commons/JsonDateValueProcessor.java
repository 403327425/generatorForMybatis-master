package com.base.commons;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonDateValueProcessor implements JsonValueProcessor {

    private String format = "yyyy-MM-dd HH:mm:ss";

    @Override
    public Object processArrayValue(Object o, JsonConfig jsonConfig) {
        return process(o);
    }

    @Override
    public Object processObjectValue(String s, Object o, JsonConfig jsonConfig) {
        if (o instanceof java.util.Date) {
            String str = new SimpleDateFormat(format).format((Date) o);
            return str;
        }
        if (null != o) {
            return o.toString();
        }
        return "";
    }

    private Object process(Object arg0) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(arg0);
    }
}
