package org.rms.icet.customer.controller;

import lombok.RequiredArgsConstructor;
import org.rms.icet.customer.dto.Customer;
import org.rms.icet.customer.entity.CustomerEntity;
import org.rms.icet.customer.service.impl.CustomerServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/customer-controller")
@RequiredArgsConstructor
public class CustomerController {

    final CustomerServiceImpl service;
    @PostMapping("/add-customer")
    Customer AddCustomer(@RequestBody Customer customer){
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

    @DeleteMapping("/delete-customer/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    String deleteEmployee(@PathVariable Long id){
        service.deleteEmployeeById(id);
        return "Delete";
    }

    @PostMapping("/update-customer")
    public void updateCustomer(@RequestBody Customer customer){
        service.updateCustomer(customer);
    }

}
