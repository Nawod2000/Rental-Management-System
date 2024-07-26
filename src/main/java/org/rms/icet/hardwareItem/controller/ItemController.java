package org.rms.icet.hardwareItem.controller;


import lombok.RequiredArgsConstructor;
import org.rms.icet.customer.dto.Customer;
import org.rms.icet.customer.entity.CustomerEntity;
import org.rms.icet.customer.service.impl.CustomerServiceImpl;
import org.rms.icet.hardwareItem.dto.Item;
import org.rms.icet.hardwareItem.entity.ItemEntity;
import org.rms.icet.hardwareItem.service.impl.ItemServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item-controller")
@RequiredArgsConstructor
public class ItemController {

    final ItemServiceImpl service;
    @PostMapping("/add-item")
    Item addIteam(@RequestBody Item item){
        return service.addIteam(item);
    }

    @GetMapping("/item-get-all")
    List<ItemEntity> getAllItem(){
        return service.getAll();
    }

    @GetMapping("/item/{id}")
    Item findById(@PathVariable Long id){
        return service.findById(id);
    }

    @DeleteMapping("/delete-item/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    String deleteItem(@PathVariable Long id){
        service.deleteItemById(id);
        return "Delete";
    }

    @PostMapping("/update-item")
    public void updateItem(@RequestBody Item item){
        service.updateItem(item);
    }
}
