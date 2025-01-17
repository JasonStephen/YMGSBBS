package com.my.bbs.dao;

import com.my.bbs.entity.BBSPostCategory;

import java.util.List;

/**
 * @author : Lu Zikang
 * @date :Created in 2023-07-02
 */

public interface BBSPostCategoryMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(BBSPostCategory record);

    int insertSelective(BBSPostCategory record);

    BBSPostCategory selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(BBSPostCategory record);

    int updateByPrimaryKey(BBSPostCategory record);

    List<BBSPostCategory> getBBSPostCategories();
}