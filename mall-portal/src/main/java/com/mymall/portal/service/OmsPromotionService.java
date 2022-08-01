package com.mymall.portal.service;

import com.mymall.mbg.model.OmsCartItem;
import com.mymall.portal.domain.CartPromotionItem;

import java.util.List;

/**
 * 促销管理Service
 *
 */
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
