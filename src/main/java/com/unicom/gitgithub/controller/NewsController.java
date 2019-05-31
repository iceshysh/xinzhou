package com.unicom.gitgithub.controller;

import com.unicom.gitgithub.entity.News;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/***************
 **@date:${sysdate}
 **@user:ysh
 **
 **@note:
 **
 **
 ***************/
//以下访问地址http://127.0.0.1:8089/news/getAll

//@Controller  //controller 指向返回结果的地址
@RestController //区分前后台
@RequestMapping(value = "news")//增加一层父级路径 拦截
public class NewsController {

    //@GetMapping   @PostMapping   @PutMapping   @DeleteMapping  子注释  多用   @RequestMapping  为总注释
    @RequestMapping(value = "/getAll") //请求 指定方法
    public List getAll(){
        News news1=new News(1,"aaa","ccccc");
        News news2=new News(2,"aaa","ccccc");
        News news3=new News(3,"aaa","ccccc");
        //System.out.println("gfhjdsj");
        List<News> list = new ArrayList<>();
        list.add(news1);
        list.add(news2);
        list.add(news3);

        return list;
    }
}
