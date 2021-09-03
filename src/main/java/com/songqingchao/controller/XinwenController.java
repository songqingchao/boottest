package com.songqingchao.controller;

import com.songqingchao.servcie.PingFenService;
import org.mybatis.spring.SqlSessionTemplate;
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
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    /**
     * 服务对象
     */

    @RequestMapping("/hello")
    public String xiwenhello(){
        System.out.println(sqlSessionTemplate.getSqlSessionFactory());
        return "hello,苏祁";
    }

    @RequestMapping("/cursor")
    public void xiwenhello2(){
         pingFenService.cursor();
    }

    @RequestMapping("/cursor2")
    public void xiwenhello22(){
        pingFenService.cursor2();
    }

    @RequestMapping("/transactionTest")
    public void transactionTest(){
        pingFenService.transactionTest();
    }
}