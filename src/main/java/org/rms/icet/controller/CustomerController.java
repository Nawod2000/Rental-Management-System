package org.rms.icet.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customer-controller")
public class CustomerController {

    @PostMapping("/add-customer")
    public void AddCustomer(){
        
    }
}
