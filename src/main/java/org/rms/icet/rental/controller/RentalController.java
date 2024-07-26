package org.rms.icet.rental.controller;


import lombok.RequiredArgsConstructor;
import org.rms.icet.hardwareItem.dto.Item;
import org.rms.icet.hardwareItem.entity.ItemEntity;
import org.rms.icet.hardwareItem.service.impl.ItemServiceImpl;
import org.rms.icet.rental.dto.Rental;
import org.rms.icet.rental.entity.RentalEntity;
import org.rms.icet.rental.service.impl.RentalServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rental-controller")
@RequiredArgsConstructor
public class RentalController {

    final RentalServiceImpl service;
    @PostMapping("/add-rental")
    Rental addRental(@RequestBody Rental rental){
        return service.addIteam(rental);
    }

    @GetMapping("/rental-get-all")
    List<RentalEntity> getAllRental(){
        return service.getAll();
    }

    @GetMapping("/rental/{id}")
    Rental findById(@PathVariable Long id){
        return service.findById(id);
    }

    @DeleteMapping("/delete-rental/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    String deleteRental(@PathVariable Long id){
        service.deleteItemById(id);
        return "Delete";
    }

    @PostMapping("/update-rental")
    public void updateRental(@RequestBody Rental rental){
        service.updateItem(rental);
    }
}
