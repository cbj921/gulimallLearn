package com.cbj.guliMall.coupon.dao;

import com.cbj.guliMall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 16:04:34
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
