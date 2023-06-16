package com.cbj.guliMall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cbj.common.utils.PageUtils;
import com.cbj.guliMall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 16:10:49
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

