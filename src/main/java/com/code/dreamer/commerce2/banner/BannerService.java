package com.code.dreamer.commerce2.banner;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BannerService {
    Page<BannerDto> findAll(Pageable pageable);

    BannerDto save(CreateBannerRequest request);
}
