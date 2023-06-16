package com.cbj.guliMall.product.dao;

import com.cbj.guliMall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 15:44:40
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
