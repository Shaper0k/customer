package ru.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.db.entity.Customer;
import ru.db.entity.Order;
import ru.db.repository.CustomerRepository;
import ru.db.repository.OrderRepository;
import ru.service.CustomerService;
import ru.service.OrderService;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository repository;

    @Override
    @Transactional
    public Customer saveOneCustomer(Customer customer) {
        return repository.save(customer);
    }

}
