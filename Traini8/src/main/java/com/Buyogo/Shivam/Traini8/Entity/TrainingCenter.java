package com.Buyogo.Shivam.Traini8.Entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class TrainingCenter {

    @Id
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

    @Column(columnDefinition = "integer default 0")
    private Integer studentCapacity;

    private Long createdOn;

    @Email(message = "Please enter a valid email address")
    private String contactEmail;

    @NotBlank(message = "Contact phone cannot be blank")
    @Pattern(regexp = "^\\d{10}$", message = "Contact phone must be a 10-digit number")
    private String contactPhone;

    @ElementCollection
    private List<String> coursesOffered;
}