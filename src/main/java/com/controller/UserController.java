package com.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gwb on 2017/4/18.
 */

@RestController
public class UserController {
    private Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("user")
    public String getUserName() {
        return "gardle构建项目开始";
    }

    @RequestMapping("roload")
    public String roload() {
        logger.error("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        return "gradle配置热加载test";
    }
}
