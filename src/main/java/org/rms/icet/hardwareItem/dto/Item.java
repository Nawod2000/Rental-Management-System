package org.rms.icet.hardwareItem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item {
    private Long id;
    private String name;
    private String availability;
    private Double rentalPerDay;
    private Double finePerDay;
}
