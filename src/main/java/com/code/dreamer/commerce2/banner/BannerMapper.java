package com.code.dreamer.commerce2.banner;

import com.code.dreamer.commerce2.brand.Brand;
import com.code.dreamer.commerce2.brand.BrandDto;
import com.code.dreamer.commerce2.brand.CreateBrandRequest;
import com.code.dreamer.commerce2.brand.UpdateBrandRequest;
import com.code.dreamer.commerce2.common.IgnoreUnmappedMapperConfig;
import com.code.dreamer.commerce2.common.PageMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", config = IgnoreUnmappedMapperConfig.class)
public interface BannerMapper extends PageMapper<Brand, BrandDto> {
    @Mappings({
            @Mapping(target = "id", source = "id") ,
            @Mapping(target = "name", source = "name")
    })
    BrandDto toDto(Brand brand);

    @Mappings({@Mapping(target = "name", source = "name")})
    Brand toBrand(CreateBrandRequest createBrandRequest);

    @Mappings({
            @Mapping(target = "id", source = "id") ,
            @Mapping(target = "name", source = "name")})
    Brand toBrand(UpdateBrandRequest updateBrandRequest);

}

