package com.mymall.admin.service;


import com.mymall.mbg.model.OmsOrderSetting;
import org.springframework.transaction.annotation.Transactional;

/**
 * 订单设置Service
 *
 */
public interface OmsOrderSettingService {
    /**
     * 获取指定订单设置
     *
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     *
     */
    @Transactional
    int update(Long id, OmsOrderSetting orderSetting);
}
