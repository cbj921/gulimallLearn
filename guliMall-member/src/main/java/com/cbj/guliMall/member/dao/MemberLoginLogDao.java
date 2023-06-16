package com.cbj.guliMall.member.dao;

import com.cbj.guliMall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 16:09:22
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
