package com.songqingchao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Xinwen)表控制层
 *
 * @author makejava
 * @since 2020-11-23 12:41:32
 */
@RestController
@RequestMapping("xinwen")
public class XinwenController {
    /**
     * 服务对象
     */
    @RequestMapping("hello")
    public String xiwenhello(){
        return "xinwenhello";
    }


}