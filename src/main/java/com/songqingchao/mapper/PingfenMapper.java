package com.songqingchao.mapper;

import com.songqingchao.entity.PingFen;
import org.apache.ibatis.annotations.Mapper;

/**
 * @user candy
 * 2021/6/1322:16
 */
@Mapper
public interface PingfenMapper {
    /**
     * 根据uid查询
     * @param uid
     * @return
     */
     PingFen selectById(String uid);

    /**
     * 根据uid查询
     * @param uid
     * @return
     */
     PingFen selectById2(String uid);

    /**
     * 插入评分表
     * @param nId
     * @return
     */
     int insert(int nId);

}
