package com.shop.retailpos.service;

import com.shop.retailpos.model.OrderItem;
import com.shop.retailpos.repository.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {

    private final OrderItemRepository orderItemRepository;

    public OrderItemService(OrderItemRepository orderItemRepository){
        this.orderItemRepository = orderItemRepository;
    }

    public List<OrderItem> listAll(){
        return orderItemRepository.findAll();
    }

    public OrderItem save(OrderItem orderItem){
        return orderItemRepository.save(orderItem);
    }

    public void delete(Long id){
        orderItemRepository.deleteById(id);
    }

    public OrderItem get(Long id){
        return orderItemRepository.findById(id).orElse(null);
    }
}
