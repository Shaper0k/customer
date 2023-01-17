package ru.db.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.db.entity.Customer;
import ru.db.entity.Order;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
