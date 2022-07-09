package com.code.dreamer.commerce2.banner;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("brands")
@RequiredArgsConstructor
public class BrannerController {

    private final BrandService brandService;

    @GetMapping
    public ResponseEntity<Page<BrandDto>> all(Pageable pageable) {
        return new ResponseEntity<>(this.brandService.findAll(pageable) , HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BrandDto> save(@RequestBody @Valid CreateBrandRequest request) {
        return new ResponseEntity<>(this.brandService.save(request) , HttpStatus.CREATED);
    }


}