package com.daodaofun.action;

import com.daodaofun.bean.Student;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 邱道长
 * @Date 2018/6/2
 * @Description
 */
public class Ognl1  extends ActionSupport {


    public String m1() {
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        Map<String,Object> map = new HashMap();
        map.put("girl","林青霞");
        valueStack.push(map);
//        valueStack.setValue("girl1","林青霞");
//        valueStack.push("");
        return SUCCESS;
    }


    public String m2() {
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        Student s = new Student();
        s.setAge(22);
        s.setName("李大嘴");
        valueStack.set("student",s);
        return SUCCESS;
    }

    public String m3() {
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        List<Student> l = new ArrayList<>();
        Student s = new Student();
        s.setAge(22);
        s.setName("李大嘴");
        Student s2 = new Student();
        s2.setAge(33);
        s2.setName("王重阳");
        l.add(s);
        l.add(s2);
        valueStack.set("students",l);
        Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
        request.put("haha","哈哈");
        return SUCCESS;
    }



    public String m4() {
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.push("我站在高岗向远处望，看一片碧波海茫茫。");
        valueStack.push("我站在深南中路，看交警一顿操作。");
        return SUCCESS;
    }

}
