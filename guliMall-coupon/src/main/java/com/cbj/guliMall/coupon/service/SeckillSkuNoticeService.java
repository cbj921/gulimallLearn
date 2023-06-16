package com.cbj.guliMall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cbj.common.utils.PageUtils;
import com.cbj.guliMall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 16:04:34
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

