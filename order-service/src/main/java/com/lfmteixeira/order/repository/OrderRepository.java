package com.lfmteixeira.order.repository;

import com.lfmteixeira.order.model.Order;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Singleton
public class OrderRepository {

    private List<Order> orders;

    public OrderRepository() {
        orders = new ArrayList<>();
    }

    public Order add(Order order) {
        order.setId((long) orders.size() + 1);
        orders.add(order);
        return order;
    }

    public Order findById(Long id) {
        Optional<Order> order = orders.stream().filter(a -> a.getId().equals(id)).findFirst();
        return order.isPresent() ? order.get() : null;
    }

    public List<Order> findAll() {
        return orders;
    }
}
