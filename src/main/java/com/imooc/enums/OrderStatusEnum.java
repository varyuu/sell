package com.imooc.enums;

import lombok.Getter;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/28 15:40
 */
@Getter
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static OrderStatusEnum getOrderStatusEnum(Integer code){
        for(OrderStatusEnum orderStatusEnum:OrderStatusEnum.values()){
            if(orderStatusEnum.code.equals(code)){
                return orderStatusEnum;
            }
        }
        return null;
    }
}
