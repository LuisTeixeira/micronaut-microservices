package com.lfmteixeira.order.controller;

import com.lfmteixeira.order.model.Order;
import com.lfmteixeira.order.repository.OrderRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;

@Controller
public class OrderController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);


    @Inject
    private OrderRepository repository;

    @Post
    public Order add(Order order) {
        LOGGER.info("Order add: {}",order);
        return repository.add(order);
    }

    @Get("/{id}")
    public Order findById(Long id) {
        LOGGER.info("Order find: {}",  id);
        return repository.findById(id);
    }

    @Get
    public List<Order> findAll() {
        LOGGER.info("Order find");
        return repository.findAll();
    }

}
