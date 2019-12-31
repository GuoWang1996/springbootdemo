package com.example.springbootdemo.service;


import org.springframework.transaction.annotation.Transactional;

import com.example.springbootdemo.common.api.CommonResult;
import com.example.springbootdemo.dto.OrderParam;

/**
 * 前台订单管理Service
 * Created by macro on 2018/8/30.
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

