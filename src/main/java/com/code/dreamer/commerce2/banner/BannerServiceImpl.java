package com.code.dreamer.commerce2.banner;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BannerServiceImpl implements BannerService {
    private final BannerRepository bannerRepository;
    private final BannerMapper mapper;

    @Override
    public Page<BannerDto> findAll(Pageable pageable) {
        return this.mapper.toPage(bannerRepository.findAll(pageable) , pageable);
    }

    @Override
    public BannerDto save(CreateBannerRequest request) {
        Banner brand = this.mapper.toBanner(request);
        Banner storedBanner = this.bannerRepository.save(brand);
        return this.mapper.toDto(storedBanner);
    }
}
