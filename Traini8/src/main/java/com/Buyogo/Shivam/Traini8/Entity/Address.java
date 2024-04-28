package com.Buyogo.Shivam.Traini8.Entity;

import jakarta.persistence.Embeddable;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Embeddable
@Data
public class Address {

    @NotBlank(message = "Detailed address cannot be blank")
    private String detailedAddress;

    @NotBlank(message = "City cannot be blank")
    private String city;

    @NotBlank(message = "State cannot be blank")
    private String state;

    @NotBlank(message = "Pincode cannot be blank")
    private String pincode;

}