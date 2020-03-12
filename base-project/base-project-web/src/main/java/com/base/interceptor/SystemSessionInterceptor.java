package com.base.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.base.pojo.sys.Admin;


/**
 * 
 * <p>
 * Title: SystemSessionInterceptor
 * </p>
 * 
 * <p>
 * Description:
 * </p>
 * 
 * @author 
 * 
 * @date 
 * 
 */
public class SystemSessionInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Admin employee = (Admin) SecurityUtils.getSubject().getPrincipal();
		if (employee == null) {
			response.sendRedirect(request.getSession().getServletContext().getContextPath() + "/user/sessionOut");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
