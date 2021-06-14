package com.songqingchao.mapper;

import com.songqingchao.entity.PingFen;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @user candy
 * 2021/6/1322:16
 */
@Mapper
public interface PingfenMapper {
    public PingFen selectById(String uid);
    public PingFen selectById2(String uid);
}
