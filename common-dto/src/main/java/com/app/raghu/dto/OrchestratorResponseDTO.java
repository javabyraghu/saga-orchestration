package com.app.raghu.dto;

import lombok.Data;

import java.util.UUID;

import com.app.raghu.enums.OrderStatus;

@Data
public class OrchestratorResponseDTO {

    private Integer userId;
    private Integer productId;
    private UUID orderId;
    private Double amount;
    private OrderStatus status;

}
