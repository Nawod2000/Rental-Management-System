package org.rms.icet.service;

import org.rms.icet.dto.Customer;
import org.rms.icet.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {
    Customer AddCustomer(Customer customer);

    List<CustomerEntity> getAll();

    Customer findById(Long id);


    void deleteEmployeeById(Long id);

    void updateCustomer(Customer customer);
}
