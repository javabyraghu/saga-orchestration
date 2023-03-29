package com.app.raghu.dto;

import lombok.Data;

import java.util.UUID;

import com.app.raghu.enums.InventoryStatus;

@Data
public class InventoryResponseDTO {

    private UUID orderId;
    private Integer userId;
    private Integer productId;
    private InventoryStatus status;

}
