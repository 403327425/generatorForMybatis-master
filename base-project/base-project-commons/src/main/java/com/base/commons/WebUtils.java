package com.base.commons;

import org.springframework.web.context.ContextLoader;

public class WebUtils {
    public static String getContextPath(){
        return ContextLoader.getCurrentWebApplicationContext().getServletContext().getContextPath();
    }
    public static String getRealPath(){
        return ContextLoader.getCurrentWebApplicationContext().getServletContext().getRealPath("/");
    }


}
