package com.cbj.guliMall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cbj.common.utils.PageUtils;
import com.cbj.guliMall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 15:44:40
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

