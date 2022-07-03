package com.code.dreamer.commerce2.brand;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {
    private final BrandRepository brandRepository;
    private final BrandMapper mapper;

    @Override
    public Page<BrandDto> findAll(Pageable pageable) {
        return this.mapper.toPage(brandRepository.findAll(pageable), pageable);
    }

    @Override
    public BrandDto save(CreateBrandRequest request) {
        Brand brand = this.mapper.toBrand(request);
        Brand storedBrand = this.brandRepository.save(brand);
        return this.mapper.toDto(storedBrand);

    }
}
