package com.cbj.guliMall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cbj.common.utils.PageUtils;
import com.cbj.guliMall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 15:44:40
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

