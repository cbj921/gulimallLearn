package com.cbj.guliMall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cbj.common.utils.PageUtils;
import com.cbj.common.utils.Query;

import com.cbj.guliMall.product.dao.CategoryDao;
import com.cbj.guliMall.product.entity.CategoryEntity;
import com.cbj.guliMall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 查询所有数据
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        // 组装成树形结构返回
        List<CategoryEntity> levelMenus = categoryEntities.stream().filter(item -> {
            return item.getParentCid() == 0;
        }).map(item -> {
            item.setChildren(getChildrens(item,categoryEntities));
            return item;
        }).sorted((item1,item2)->{
            return (item1.getSort()==null?0:item1.getSort()) - (item2.getSort()==null?0:item2.getSort());
        }).collect(Collectors.toList());

        return levelMenus;
    }

    @Override
    public void removeMenuByIds(List<Long> list) {
        // TODO: 检查菜单依赖，看菜单是否被其他地方引用，如果引用则删除失败
        baseMapper.deleteBatchIds(list);
    }

    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream().filter(item -> {
            return item.getParentCid() == root.getCatId();
        }).map(item -> {
            item.setChildren(getChildrens(item, all));
            return item;
        }).sorted((item1,item2)->{
            return (item1.getSort()==null?0:item1.getSort()) - (item2.getSort()==null?0:item2.getSort());
        }).collect(Collectors.toList());

        return children;
    }
}