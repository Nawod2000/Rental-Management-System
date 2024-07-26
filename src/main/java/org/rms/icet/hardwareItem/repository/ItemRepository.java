package org.rms.icet.hardwareItem.repository;

import org.rms.icet.hardwareItem.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemEntity,Long> {
}
