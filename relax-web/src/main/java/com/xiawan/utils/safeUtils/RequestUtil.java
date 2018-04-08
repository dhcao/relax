package com.xiawan.utils.safeUtils;

import com.xiawan.utils.commomUtils.StringUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * request的工具类
 * Created by dhcao on 2018/3/28.
 */
public class RequestUtil {

    private RequestUtil(){}

    /**
     * 过滤request中有没有非法参数，安全隐患
     * @param request
     * @return
     */
    public boolean checkSafe(HttpServletRequest request){

        return false;
    }

    /**
     * 将request中的参数转为Map
     * @param request
     * @return
     */
    public static Map<String,String> paramToMap(HttpServletRequest request){
        Map<String,String> params = new HashMap<String, String>();

        Map rMap = request.getParameterMap();
        Iterator rIter = rMap.keySet().iterator();

        while(rIter.hasNext()){
            Object key = rIter.next();
            String value = request.getParameter(key.toString());
            if(key==null || value==null){
                continue;
            }
            params.put(key.toString(), value.toString());
        }

        return params;

    }


    public static String getRequestUrl(HttpServletRequest request) {
        String redirect =(String)request.getAttribute("redirect");
        if(redirect!=null) {
            return redirect;
        }
        String pathInfo = (request).getPathInfo();
        String queryString = (request).getQueryString();

        String uri = (request).getServletPath();
        String ctx = request.getContextPath();
        ctx = ctx.equals("/") ? "" : ctx;
/*		uri = uri.startsWith("/")?uri.substring(1, uri.length()):uri;
*/		if (uri == null) {
            uri = (request).getRequestURI();
            uri = uri.substring((request).getContextPath().length());
        }

        return ctx+ uri + ((pathInfo == null) ? "" : pathInfo)
                + ((queryString == null) ? "" : ("?" + queryString));
    }

    /**
     * 获取完整的url，包括域名端口等
     * @return
     */
    public static String getWholeUrl(HttpServletRequest request){
        String servername =request.getServerName();
        String path  = request.getServletPath();
        int port = request.getServerPort();

        String portstr="";
        if(port!=80){
            portstr=":"+port;
        }
        String contextPath = request.getContextPath();
        if(contextPath.equals("/")){
            contextPath="";
        }


        String url  = "http://"+servername+portstr+contextPath+"/"+path;

        return url;

    }



    /**
     * 获取Integer 的值
     * @param request
     * @param name
     * @return 如果没有返回null
     */
    public static Integer getIntegerValue(HttpServletRequest request,String name){
        String value =request.getParameter(name);
        if(StringUtil.isEmpty(value)){
            return null;
        }else{
            return Integer.valueOf(value);
        }

    }


    public static Double getDoubleValue(HttpServletRequest request,String name){
        String value =request.getParameter(name);
        if(StringUtil.isEmpty(value)){
            return null;
        }else{
            return Double.valueOf(value);
        }

    }




    /**
     * 获取int的值
     * @param request
     * @param name
     * @return 如果没有返回0
     */
    public static int getIntValue(HttpServletRequest request,String name){
        String value =request.getParameter(name);
        if(StringUtil.isEmpty(value)){
            return 0;
        }else{
            return Integer.valueOf(value);
        }
    }

    public static String getRequestMethod(HttpServletRequest request){
        String method  = request.getParameter("_method");
        method=method==null?"get":method;
        method=method.toUpperCase();
        return method;
    }

    public static String getIp(HttpServletRequest request){
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;

    }

}
