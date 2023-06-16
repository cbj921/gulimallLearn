package com.cbj.guliMall.member.feign;

import com.cbj.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("coupon/coupon/member/list")
    public R testOpenFeigin();
}
