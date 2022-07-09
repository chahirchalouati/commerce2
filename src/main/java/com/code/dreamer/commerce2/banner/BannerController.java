package com.code.dreamer.commerce2.banner;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/banners")
@RequiredArgsConstructor
public class BannerController {

    private final BannerService bannerService;

    @GetMapping
    public ResponseEntity<Page<BannerDto>> all(Pageable pageable) {
        return new ResponseEntity<>(this.bannerService.findAll(pageable) , HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BannerDto> save( @Valid CreateBannerRequest request) {
        return new ResponseEntity<>(this.bannerService.save(request) , HttpStatus.CREATED);
    }


}