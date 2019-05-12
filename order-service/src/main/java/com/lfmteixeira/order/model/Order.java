package com.lfmteixeira.order.model;

import java.util.List;

public class Order {

    private Long id;
    private List<OrderLine> entries;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderLine> getEntries() {
        return entries;
    }

    public void setEntries(List<OrderLine> entries) {
        this.entries = entries;
    }
}
