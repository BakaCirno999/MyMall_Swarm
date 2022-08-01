package com.mymall.portal.service;

import com.mymall.portal.domain.OmsOrderReturnApplyParam;

/**
 * 订单退货管理Service
 *
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
