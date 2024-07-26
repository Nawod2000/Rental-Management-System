package org.rms.icet.rental.service;

import org.rms.icet.rental.dto.Rental;
import org.rms.icet.rental.entity.RentalEntity;

import java.util.List;

public interface RentalService {
    Rental addIteam(Rental rental);

    List<RentalEntity> getAll();

    Rental findById(Long id);

    void deleteItemById(Long id);

    void updateItem(Rental rental);
}
