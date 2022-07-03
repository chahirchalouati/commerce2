package com.code.dreamer.commerce2.brand;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BrandService {
    Page<BrandDto> findAll(Pageable pageable);

    BrandDto save(CreateBrandRequest request);
}
