package com.app.raghu.dto;

import lombok.Data;

import java.util.UUID;

import com.app.raghu.enums.OrderStatus;

@Data
public class OrderResponseDTO {

    private UUID orderId;
    private Integer userId;
    private Integer productId;
    private Double amount;
    private OrderStatus status;

}
