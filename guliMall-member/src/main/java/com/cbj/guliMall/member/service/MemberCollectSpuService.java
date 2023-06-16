package com.cbj.guliMall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cbj.common.utils.PageUtils;
import com.cbj.guliMall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author cbj
 * @email 447933991@qq.com
 * @date 2023-06-16 16:09:22
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

