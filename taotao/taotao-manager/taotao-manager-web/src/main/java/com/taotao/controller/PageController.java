package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Albert
 * @Date: 2019/3/2 10:03
 * @Description: 只是用来页面跳转
 */
@Controller
public class PageController {

    /**
     *
     * @return 返回首页
     */
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    /**
     *
     * @param page  需求要展示的页面
     * @return  返回相应的页面
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
