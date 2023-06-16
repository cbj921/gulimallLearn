package com.cbj.guliMall.product;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.cbj.guliMall.product.entity.BrandEntity;
import com.cbj.guliMall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GuliMallProductApplicationTests {
	@Autowired
	BrandService brandService;

	@Test
	void testBrandSave() {
		BrandEntity brand = new BrandEntity();
		brand.setName("华为");
		brandService.save(brand);
		System.out.println("save success!");
	}

	@Test
	void testUpdateBrand() {
		BrandEntity brand = new BrandEntity();
		brand.setName("HUAWEI1");
		brand.setBrandId(1L);
		brand.setDescript("let's go!");
		brandService.updateById(brand);
		System.out.println("update success");
	}

	@Test
	void testQueryBrand() {
		List<BrandEntity> res = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L));
		res.forEach(e->{
			System.out.println(e);
		});
	}

}
