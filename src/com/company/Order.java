package com.company;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<OrderLine> orderlines;
    public String customerName;

    public Order(List<OrderLine> orderlines, String customerName) {
        this.orderlines = orderlines;
        this.customerName = customerName;
    }

    public void addOrderLine(OrderLine orderLine){
        List<OrderLine> list = new ArrayList<>();
        list.add(orderLine);
    }

    public List<OrderLine> getAllOrderLines(){
        return (OrderLine orderLine : OrderLine)
    }
}
