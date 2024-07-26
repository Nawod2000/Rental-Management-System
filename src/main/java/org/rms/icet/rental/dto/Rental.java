package org.rms.icet.rental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rental {
    private Long id;
    private String rentalDate;
    private String returnDate;
    private Integer dueDate;
    private Long totalCost;
    private Long fine;
}
