package org.rms.icet.customer.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.rms.icet.customer.dto.Customer;
import org.rms.icet.customer.entity.CustomerEntity;
import org.rms.icet.customer.repository.CustomerRepository;
import org.rms.icet.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepository repository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public Customer AddCustomer(Customer customer) {

        CustomerEntity customerEntity = mapper.convertValue(customer, CustomerEntity.class);
        repository.save(customerEntity);
        return mapper.convertValue(customerEntity, Customer.class);

    }

    @Override
    public List<CustomerEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        CustomerEntity customerEntity = repository.findById(id).get();
        return mapper.convertValue(customerEntity, Customer.class);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
        }
    }

    @Override
    public void updateCustomer(Customer customer) {
        if (repository.findById(customer.getCustId()).isPresent()){
            repository.save(new ObjectMapper().convertValue(customer, CustomerEntity.class));
        }
    }
}
