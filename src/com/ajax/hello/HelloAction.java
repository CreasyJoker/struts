package com.ajax.hello;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.*;

/**
 * @创始人：Joker
 * @创建时间：2018/9/4
 * @描述：
 */
public class HelloAction extends ActionSupport {

    private Map<String,String> names= new HashMap<>();
    @Override
    public String execute() throws Exception {
        ServletActionContext.getResponse().setContentType("text/html;charSet=utf-8");
       String msg="登录失败";
        ServletActionContext.getResponse().getWriter().print(msg);
        return NONE;
    }


}
