package com.songqingchao.servcie.impl;

import com.songqingchao.entity.PingFen;
import com.songqingchao.mapper.PingFenMapper;
import com.songqingchao.servcie.PingFenService;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @user candy
 * 2021/6/1323:01
 */
@Service
public class PingFenServiceImpl implements PingFenService{
    @Autowired
    private PingFenMapper pingfenMapper;


    @Override
    public List<PingFen> queryPingFen(int uid) {
        return pingfenMapper.selectById(uid);
    }
    @Override
    public int insert(int nid) {
        return pingfenMapper.insert(3);
    }
    @Override
    public Cursor<PingFen> cursor() {
        return pingfenMapper.cursor();
    }
}
