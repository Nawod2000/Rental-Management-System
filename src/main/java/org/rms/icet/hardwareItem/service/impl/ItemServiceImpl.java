package org.rms.icet.hardwareItem.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.rms.icet.hardwareItem.dto.Item;
import org.rms.icet.hardwareItem.entity.ItemEntity;
import org.rms.icet.hardwareItem.repository.ItemRepository;
import org.rms.icet.hardwareItem.service.IteamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements IteamService {

    final ItemRepository save;

    @Autowired
    ObjectMapper mapper;
    @Override
    public Item addIteam(Item item) {

        ItemEntity itemEntity = mapper.convertValue(item, ItemEntity.class);
        save.save(itemEntity);
        return mapper.convertValue(itemEntity, Item.class);
    }

    @Override
    public List<ItemEntity> getAll() {
        return save.findAll();
    }

    @Override
    public Item findById(Long id) {
        ItemEntity itemEntity = save.findById(id).get();
        return mapper.convertValue(itemEntity, Item.class);
    }

    @Override
    public void deleteItemById(Long id) {
        if (save.existsById(id)){
            save.deleteById(id);
        }
    }

    @Override
    public void updateItem(Item item) {
        if (save.findById(item.getId()).isPresent()){
            save.save(new ObjectMapper().convertValue(item, ItemEntity.class));
        }
    }
}
