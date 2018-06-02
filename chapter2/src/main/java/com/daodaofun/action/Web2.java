package com.daodaofun.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Author 邱道长
 * @Date 2018/6/2
 * @Description
 * 【web元素访问方式二】
 *  通过获取request
 *  自然可以获取会话以及application
 */
public class Web2 extends ActionSupport implements ServletRequestAware  {

    private HttpServletRequest request;

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }


    public String m2(){
        System.out.println(request.getParameter("girl"));

        return SUCCESS;
    }

}
