package com.cbj.guliMall.member.dao;

import com.cbj.guliMall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 16:09:23
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
