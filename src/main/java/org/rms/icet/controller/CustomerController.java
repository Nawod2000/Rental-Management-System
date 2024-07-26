package org.rms.icet.controller;

import lombok.RequiredArgsConstructor;
import org.rms.icet.dto.Customer;
import org.rms.icet.entity.CustomerEntity;
import org.rms.icet.service.impl.CustomerServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/customer-controller")
@RequiredArgsConstructor
public class CustomerController {

    final CustomerServiceImpl service;
    @PostMapping("/add-customer")
    public Customer AddCustomer(@RequestBody Customer customer){
        return service.AddCustomer(customer);
    }

    @GetMapping("/customer-get-all")
    List<CustomerEntity> getAll(){
        return service.getAll();
    }

    @GetMapping("/customer/{id}")
    Customer findById(@PathVariable Long id){
        return service.findById(id);
    }
}
