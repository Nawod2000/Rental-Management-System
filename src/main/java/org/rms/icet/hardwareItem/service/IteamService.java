package org.rms.icet.hardwareItem.service;

import org.rms.icet.customer.dto.Customer;
import org.rms.icet.customer.entity.CustomerEntity;
import org.rms.icet.hardwareItem.dto.Item;
import org.rms.icet.hardwareItem.entity.ItemEntity;

import java.util.List;

public interface IteamService {
    Item addIteam(Item item);

    List<ItemEntity> getAll();

    Item findById(Long id);

    void deleteItemById(Long id);

    void updateItem(Item item);
}
