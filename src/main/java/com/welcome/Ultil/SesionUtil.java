package com.welcome.Ultil;

import javax.servlet.http.HttpServletRequest;

public class SesionUtil {
    private static SesionUtil sesionUtil=null;
    public static SesionUtil getInstance(){
        if(sesionUtil==null){
            sesionUtil=new SesionUtil();
        }
        return sesionUtil;
    }
    public void putValue(HttpServletRequest request,String key,Object value){
        request.getSession().setAttribute(key,value);
    }
    public Object getValue(HttpServletRequest request,String key){
        return request.getSession().getAttribute(key);
    }
    public void removeValue(HttpServletRequest request,String key){
        request.getSession().removeAttribute(key);
    }
}
