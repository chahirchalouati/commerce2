package com.code.dreamer.commerce2.banner;

import com.code.dreamer.commerce2.brand.BrandDto;
import com.code.dreamer.commerce2.brand.CreateBrandRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BannerService {
    Page<BrandDto> findAll(Pageable pageable);

    BrandDto save(CreateBrandRequest request);
}
