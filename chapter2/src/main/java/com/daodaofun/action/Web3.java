package com.daodaofun.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * @Author 邱道长
 * @Date 2018/6/2
 * @Description
 */
public class Web3 extends ActionSupport  {


    public String m3() {

        // 1 request获取，本质上还是map
        Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
        Object girl = request.get("girl");
        System.out.println(girl + "web3....");

        // 2 session获取
        Map<String, Object> session = ActionContext.getContext().getSession();
        System.out.println(session.get("myGirl"));

        return SUCCESS;

    }
}
