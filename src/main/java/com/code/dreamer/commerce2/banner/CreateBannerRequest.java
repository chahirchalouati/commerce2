package com.code.dreamer.commerce2.banner;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CreateBannerRequest {

    @NotBlank(message = "brand name can't be blank")
    private String name;
}
