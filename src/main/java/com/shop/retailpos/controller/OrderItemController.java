package com.shop.retailpos.controller;

import com.shop.retailpos.model.OrderItem;
import com.shop.retailpos.service.OrderItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-items")
public class OrderItemController {

    private final OrderItemService orderItemService;

    public OrderItemController(OrderItemService orderItemService){
        this.orderItemService = orderItemService;
    }

    @GetMapping
    public List<OrderItem> getAllOrderItems(){
        return orderItemService.listAll();
    }

    @GetMapping("/{id}")
    public OrderItem getOrderItemById(@PathVariable Long id){
        return orderItemService.get(id);
    }

    @PostMapping
    public OrderItem addOrderItem(@RequestBody OrderItem orderItem){
        return orderItemService.save(orderItem);
    }

    @PutMapping("/{id}")
    public OrderItem updateOrderItem(@PathVariable Long id, @RequestBody OrderItem orderItem){
        orderItem.setId(id);
        return orderItemService.save(orderItem);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderItem(@PathVariable Long id){
        orderItemService.delete(id);
    }
}
