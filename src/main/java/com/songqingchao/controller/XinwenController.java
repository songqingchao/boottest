package com.songqingchao.controller;

import com.songqingchao.servcie.PingFenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Xinwen)表控制层
 *
 * @author makejava
 * @since 2020-11-23 12:41:32
 */
@RestController
@RequestMapping("xinwen")
public class XinwenController {
    @Autowired
    private PingFenService pingFenService;
    /**
     * 服务对象
     */
    @RequestMapping("/hello")
    public String xiwenhello(){
        return "xinwenhello";
    }

    @RequestMapping("/cursor")
    public void xiwenhello2(){
         pingFenService.cursor();
    }





}