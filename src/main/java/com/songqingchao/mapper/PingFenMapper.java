package com.songqingchao.mapper;

import com.songqingchao.entity.PingFen;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @user candy
 * 2021/6/1322:16
 */
@Mapper
public interface PingFenMapper {
    /**
     * 根据uid查询
     * @param uid
     * @return
     */
    List<PingFen> selectById(int uid);

    /**
     * 根据uid查询
     * @param uid
     * @return
     */
     PingFen selectById2(int uid);

    /**
     * 插入评分表
     * @param nId
     * @return
     */
     int insert(int nId);

}
