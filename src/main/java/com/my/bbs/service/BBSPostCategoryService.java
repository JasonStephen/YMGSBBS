package com.my.bbs.service;

import com.my.bbs.entity.BBSPostCategory;

import java.util.List;

/**
 * @author : Mao Jiasheng
 * @date :Created in 2023-07-02
 */

public interface BBSPostCategoryService {
    /**
     * 获取分类列表
     *
     * @return
     */
    List<BBSPostCategory> getBBSPostCategories();

    BBSPostCategory selectById(Integer categoryId);
}
