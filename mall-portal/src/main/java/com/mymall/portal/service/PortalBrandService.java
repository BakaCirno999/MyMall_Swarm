package com.mymall.portal.service;

import com.mymall.common.api.CommonPage;
import com.mymall.mbg.model.PmsBrand;
import com.mymall.mbg.model.PmsProduct;

import java.util.List;

/**
 * 前台品牌管理Service
 *
 */
public interface PortalBrandService {
    /**
     * 分页获取推荐品牌
     */
    List<PmsBrand> recommendList(Integer pageNum, Integer pageSize);

    /**
     * 获取品牌详情
     */
    PmsBrand detail(Long brandId);

    /**
     * 分页获取品牌关联商品
     */
    CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize);
}
