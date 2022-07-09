package com.code.dreamer.commerce2.banner;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;

@Data
public class CreateBannerRequest {
    @NotBlank(message = "banner title can't be blank")
    private String title;
    @NotBlank(message = "banner text can't be blank")
    private String text;
    @NotBlank(message = "banner image can't be blank")
    private MultipartFile image;


}
