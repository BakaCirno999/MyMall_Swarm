package com.mymall.admin.service;

import com.mymall.mbg.model.CmsPrefrenceArea;

import java.util.List;

/**
 * 商品优选管理Service
 *
 */
public interface CmsPrefrenceAreaService {
    /**
     * 获取所有优选专区
     *
     */
    List<CmsPrefrenceArea> listAll();
}
