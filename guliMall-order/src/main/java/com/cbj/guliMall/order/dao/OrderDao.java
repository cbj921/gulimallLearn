package com.cbj.guliMall.order.dao;

import com.cbj.guliMall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 16:07:05
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
