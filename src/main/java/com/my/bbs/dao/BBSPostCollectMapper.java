package com.my.bbs.dao;

import com.my.bbs.entity.BBSPostCollect;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : Lu Zikang
 * @date :Created in 2023-07-02
 */

public interface BBSPostCollectMapper {
    int deleteByPrimaryKey(Long recordId);

    int insert(BBSPostCollect record);

    int insertSelective(BBSPostCollect record);

    BBSPostCollect selectByPrimaryKey(Long recordId);

    BBSPostCollect selectByUserIdAndPostId(@Param("userId") Long userId, @Param("postId") Long postId);

    List<BBSPostCollect> listByUserId(@Param("userId") Long userId);

    int updateByPrimaryKeySelective(BBSPostCollect record);

    int updateByPrimaryKey(BBSPostCollect record);
}