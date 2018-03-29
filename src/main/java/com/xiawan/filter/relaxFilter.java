package com.xiawan.filter;

import com.xiawan.utils.SafeUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by dhcao. on 2018/3/28.
 */
public class relaxFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * 安全拦截，xss、sql注入拦截，访问拦截
     * @param servletRequest
     * @param servletResponse
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        //获取req和rep对象
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        String url = httpRequest.getServletPath();
        
        //对rul参数进行安全过滤，特殊字符校验，xss过滤
        Map paramMap = httpRequest.getParameterMap();
        if (!SafeUtil.checkMap(paramMap)) {
            return;
        }
        
        //对url进行分类处理
        // TODO: 2018/3/29  
    }

    @Override
    public void destroy() {

    }
}
