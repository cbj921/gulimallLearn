package com.cbj.guliMall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cbj.common.utils.PageUtils;
import com.cbj.guliMall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 16:07:05
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

