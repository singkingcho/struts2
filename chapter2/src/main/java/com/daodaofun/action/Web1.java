package com.daodaofun.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.RequestAware;

import java.util.Map;


/**
 * @Author 邱道长
 * @Date 2018/6/2
 * @Description
 * 【web元素方式方式1】
 */
public class Web1 extends ActionSupport implements RequestAware {


    private Map<String,Object> request;


    @Override
    public void setRequest(Map<String, Object> request) {

        this.request = request;
    }


    public String m1() {
        System.out.println(request.get("girl"));
        return SUCCESS;
    }
}
