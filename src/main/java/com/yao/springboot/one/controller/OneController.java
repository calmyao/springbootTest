package com.yao.springboot.one.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * 这个启动类必须要放在父包下,默认扫描这个类所在的的包下:等价于com.yao.spring.one
 * Created by Calm on 2017/10/21
 *
 */
@Controller
public class OneController {

    @RequestMapping("/springboot/one")
    @ResponseBody
    public String oneMethod(){
        return "hello springboot!";
    }

}
