package ru.controllers;

import jakarta.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import ru.db.entity.Customer;
import ru.db.entity.Order;
import ru.service.CustomerService;
import ru.service.OrderService;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Validated
public class CustomerResource {

    private final CustomerService service;


    @PostMapping("/customers")
    public ResponseEntity<Customer> createOrder(@Valid @RequestBody Customer customer) throws URISyntaxException {
        if (customer.getId() != null) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "A new customer cannot already have an ID");
        }
        var resCustomer = service.saveOneCustomer(customer);
        return ResponseEntity.created(new URI("/api/customers/" + customer.getId()))
                .body(resCustomer);
    }

}
