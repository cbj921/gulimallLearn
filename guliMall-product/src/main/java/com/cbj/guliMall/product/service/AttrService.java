package com.cbj.guliMall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cbj.common.utils.PageUtils;
import com.cbj.guliMall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 15:44:41
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

