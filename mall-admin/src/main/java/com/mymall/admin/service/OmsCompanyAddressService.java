package com.mymall.admin.service;

import com.mymall.mbg.model.OmsCompanyAddress;

import java.util.List;

/**
 * 收货地址管Service
 *
 */
public interface OmsCompanyAddressService {
    /**
     * 获取全部收货地址
     *
     */
    List<OmsCompanyAddress> list();
}
