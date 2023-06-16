package com.cbj.guliMall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cbj.common.utils.PageUtils;
import com.cbj.guliMall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 16:04:34
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

