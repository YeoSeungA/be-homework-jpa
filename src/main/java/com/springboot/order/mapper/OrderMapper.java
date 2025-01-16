package com.springboot.order.mapper;

import com.springboot.order.dto.OrderCoffeeResponseDto;
import com.springboot.order.dto.OrderPatchDto;
import com.springboot.order.dto.OrderPostDto;
import com.springboot.order.dto.OrderResponseDto;
import com.springboot.order.entity.Order;
import com.springboot.order.entity.OrderCoffee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    Order orderPostDtoToOrder(OrderPostDto orderPostDto);
    Order orderPatchDtoToOrder(OrderPatchDto orderPatchDto);
    OrderResponseDto orderToOrderResponseDto(Order order);
    List<OrderResponseDto> ordersToOrderResponseDtos(List<Order> orders);

    OrderCoffeeResponseDto orderCoffeeToOrderCoffeeResponseDto(OrderCoffee orderCoffee);
//    아래 코드를 진행시키기 위해서는 OrderCoffeeResponseDto에 @NoArgsConstructor가 있어야 한다.
//    default OrderCoffeeResponseDto orderCoffeeToOrderCoffeeResponseDto(OrderCoffee orderCoffee) {
//        OrderCoffeeResponseDto orderCoffeeResponseDto = new OrderCoffeeResponseDto();
//        orderCoffeeResponseDto.setCoffeeId(orderCoffee.getOrderCoffeeId());
//        orderCoffeeResponseDto.setKorName(orderCoffee.getCoffee().getKorName());
//        orderCoffeeResponseDto.setEngName(orderCoffee.getCoffee().getEngName());
//        orderCoffeeResponseDto.setPrice(orderCoffee.getCoffee().getPrice());
//        orderCoffeeResponseDto.setQuantity (orderCoffee.getQuantity());
//    }
//    return orderCoffeeResponseDto;
}
