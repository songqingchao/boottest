package com.songqingchao.servcie;

import com.songqingchao.entity.PingFen;

import java.util.List;

/**
 * @user candy
 * 2021/6/1322:59
 */
public interface PingFenService {
    /**
     * 根据uid查询评分表
     * @param uid
     */
    List<PingFen> queryPingFen(int uid);

    /**
     * 根据nid插入评分表
     * @param nid
     * @return
     */
    int insert(int nid);
}
