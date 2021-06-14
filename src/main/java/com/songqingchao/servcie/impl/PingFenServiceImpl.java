package com.songqingchao.servcie.impl;

import com.songqingchao.mapper.PingfenMapper;
import com.songqingchao.servcie.PingFenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @user candy
 * 2021/6/1323:01
 */
@Service
public class PingFenServiceImpl implements PingFenService{
    @Autowired
    private PingfenMapper pingfenMapper;


    @Override
    public void queryPingFen(Integer uid) {
//        pingfenMapper.selectById(123);
    }
}
