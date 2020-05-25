package com.qy.mall.demo.service;

import com.qy.mall.demo.common.CommonResult;
import com.qy.mall.demo.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * 前台订单管理service
 */
public interface OmsPortalOrderService {
    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}
