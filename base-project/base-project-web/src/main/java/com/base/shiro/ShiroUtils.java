package com.base.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import com.base.pojo.sys.Admin;


/**
 * 
 * @ClassName:  ShiroUtils   
 * @Description:shiro工具类
 * @author: 江登飞
 * @date:   2019年7月26日 下午7:37:37   
 *   
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目
 */
public class ShiroUtils {
	public static Session getSession() {
        return SecurityUtils.getSubject().getSession();
    }
	
	public static Subject getSubject() {
		return SecurityUtils.getSubject();
	}
	
	public static Admin getUserEntity() {
		return (Admin) SecurityUtils.getSubject().getPrincipal();
	}
	
	public static Integer getAdminId() {
		return getUserEntity().getAdminId();
	}
	
	public static String getAdminNickName() {
		return getUserEntity().getAdminNickName();
	}
	
	public static void setSessionAttribute(Object key, Object value) {
	    getSession().setAttribute(key, value);
	}
	
	public static Object getSessionAttribute(Object key) {
        return getSession().getAttribute(key);
    }
	
	public static boolean isLogin() {
        return SecurityUtils.getSubject().getPrincipal() != null;
    }
	
	public static void logout() {
        SecurityUtils.getSubject().logout();
    }
	
	public static String getKaptcha(String key) {
        String kaptcha;
        try {
            kaptcha = getSessionAttribute(key).toString();
            getSession().removeAttribute(key);
        } catch (Exception e) {
            return null;
        }
        return kaptcha;
    }
}
