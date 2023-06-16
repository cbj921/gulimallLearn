package com.cbj.guliMall.order.dao;

import com.cbj.guliMall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 16:07:05
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
