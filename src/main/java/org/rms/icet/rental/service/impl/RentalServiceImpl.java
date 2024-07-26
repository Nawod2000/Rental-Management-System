package org.rms.icet.rental.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.rms.icet.customer.dto.Customer;
import org.rms.icet.customer.entity.CustomerEntity;
import org.rms.icet.rental.dto.Rental;
import org.rms.icet.rental.entity.RentalEntity;
import org.rms.icet.rental.repository.RentalRepository;
import org.rms.icet.rental.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {

    final RentalRepository repository;

    @Autowired
    ObjectMapper mapper;
    @Override
    public Rental addIteam(Rental rental) {
        RentalEntity rentalEntity = mapper.convertValue(rental, RentalEntity.class);
        repository.save(rentalEntity);
        return mapper.convertValue(rentalEntity, Rental.class);
    }

    @Override
    public List<RentalEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public Rental findById(Long id) {
        RentalEntity rentalEntity = repository.findById(id).get();
        return mapper.convertValue(rentalEntity, Rental.class);
    }

    @Override
    public void deleteItemById(Long id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
        }
    }

    @Override
    public void updateItem(Rental rental) {
        if (repository.findById(rental.getId()).isPresent()){
            repository.save(new ObjectMapper().convertValue(rental, RentalEntity.class));
        }
    }
}
