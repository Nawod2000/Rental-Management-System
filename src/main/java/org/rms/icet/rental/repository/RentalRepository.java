package org.rms.icet.rental.repository;

import org.rms.icet.hardwareItem.entity.ItemEntity;
import org.rms.icet.rental.entity.RentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<RentalEntity,Long> {
}
