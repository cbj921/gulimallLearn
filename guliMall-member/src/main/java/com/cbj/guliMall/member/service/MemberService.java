package com.cbj.guliMall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cbj.common.utils.PageUtils;
import com.cbj.guliMall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 16:09:23
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

