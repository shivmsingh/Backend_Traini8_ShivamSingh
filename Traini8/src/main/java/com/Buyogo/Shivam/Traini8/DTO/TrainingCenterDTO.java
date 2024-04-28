package com.Buyogo.Shivam.Traini8.DTO;

import com.Buyogo.Shivam.Traini8.Entity.Address;
import jakarta.persistence.Embedded;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.List;

@Data
public class TrainingCenterDTO {

    @NotBlank(message = "Center code cannot be blank")
    @Size(min = 12, max = 12, message = "Center code must be 12 characters long")
    @Pattern(regexp = "^[a-zA-Z0-9]*$")
    private String centerCode;

    @NotBlank(message = "Center name cannot be blank")
    @Size(max = 40, message = "Center name must not exceed 40 characters")
    private String centerName;

    @Embedded
    @Valid
    private Address address;

    private List<String> coursesOffered;

    private Integer studentCapacity;

    @Email(message = "Please enter a valid email address")
    private String contactEmail;

    @NotBlank(message = "Contact phone cannot be blank")
    @Pattern(regexp = "^\\d{10}$", message = "Contact phone must be a 10-digit number")
    private String contactPhone;

    private Long createdOn;
}