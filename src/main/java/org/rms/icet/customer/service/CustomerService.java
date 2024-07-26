package org.rms.icet.customer.service;

import org.rms.icet.customer.dto.Customer;
import org.rms.icet.customer.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {
    Customer AddCustomer(Customer customer);

    List<CustomerEntity> getAll();

    Customer findById(Long id);


    void deleteEmployeeById(Long id);

    void updateCustomer(Customer customer);
}
