package com.code.dreamer.commerce2.brand;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CreateBrandRequest {
    @NotBlank(message = "brand name can't be blank")
    private String name;
}
