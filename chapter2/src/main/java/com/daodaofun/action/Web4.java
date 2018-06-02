package com.daodaofun.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author 邱道长
 * @Date 2018/6/2
 * @Description
 */
public class Web4 extends ActionSupport {



    public String m4 () {
        // 获取真实的请求

        HttpServletRequest request = ServletActionContext.getRequest();
        System.out.println(request.getParameter("feel"));

        return SUCCESS;
    }
}
