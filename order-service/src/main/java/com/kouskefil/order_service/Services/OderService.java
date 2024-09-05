package com.kouskefil.order_service.Services;

import com.kouskefil.order_service.Dto.OrderLineItemsDto;
import com.kouskefil.order_service.Dto.OrderRequest;
import com.kouskefil.order_service.Models.Order;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OderService {

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        orderRequest.getOrderLineItemsDtoList()
                .stream()
                .map(this::mapToDto);
    }

    private Object mapToDto(OrderLineItemsDto orderLineItemsDto) {
        return null;
    }


}
