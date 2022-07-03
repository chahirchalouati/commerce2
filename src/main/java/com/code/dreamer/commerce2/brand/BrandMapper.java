package com.code.dreamer.commerce2.brand;

import com.code.dreamer.commerce2.common.IgnoreUnmappedMapperConfig;
import com.code.dreamer.commerce2.common.PageMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", config = IgnoreUnmappedMapperConfig.class)
public interface BrandMapper extends PageMapper<Brand, BrandDto> {
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

