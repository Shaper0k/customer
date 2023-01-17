package ru.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.db.entity.Order;
import ru.db.repository.OrderRepository;
import ru.service.OrderService;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository repository;

    @Override
    @Transactional
    public Order saveOneOrder(Order order) {
        return repository.save(order);
    }

}
