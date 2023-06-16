package com.cbj.guliMall.order.dao;

import com.cbj.guliMall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 16:07:05
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
