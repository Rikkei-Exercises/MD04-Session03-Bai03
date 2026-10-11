package com.example.productservice.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRequestDTO {

    @NotBlank(message = "name is required")
    private String name;

    @Min(value = 1, message = "price must be greater than 0")
    private BigDecimal price;

    @Min(value = 0, message = "stockQuantity cannot be negative")
    private Integer stockQuantity;
}
