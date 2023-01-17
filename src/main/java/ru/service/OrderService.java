package ru.service;

import ru.db.entity.Order;

public interface OrderService {

    Order saveOneOrder(Order order);

}
