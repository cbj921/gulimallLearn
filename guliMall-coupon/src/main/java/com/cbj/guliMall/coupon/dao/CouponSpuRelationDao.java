package com.cbj.guliMall.coupon.dao;

import com.cbj.guliMall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 16:04:34
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
