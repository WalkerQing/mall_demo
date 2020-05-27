package com.qy.mall.demo.component;

import com.qy.mall.demo.service.OmsPortalOrderService;
import lombok.extern.java.Log;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Log
@Component
@RabbitListener(queues = "mall.order.cancel")
public class CancelOrderReceiver {


    @Autowired
    private OmsPortalOrderService omsPortalOrderService;
    @RabbitHandler
    public void handle(Long orderId){
        log.info("receive delay message orderId:"+orderId);
        omsPortalOrderService.cancelOrder(orderId);
    }
}
