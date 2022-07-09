package com.code.dreamer.commerce2.banner;

import com.code.dreamer.commerce2.common.IgnoreUnmappedMapperConfig;
import com.code.dreamer.commerce2.common.PageMapper;
import com.code.dreamer.commerce2.storage.FileStorageService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.mapstruct.*;

@Mapper(componentModel = "spring",
        config = IgnoreUnmappedMapperConfig.class,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class BannerMapper implements PageMapper<Banner, BannerDto> {

    protected FileStorageService fileStorageService;

    @Mappings({
            @Mapping(target = "id", source = "id") ,
            @Mapping(target = "text", source = "text") ,
            @Mapping(target = "title", source = "title") ,
            @Mapping(target = "image", source = "image")
    })
    public abstract BannerDto toDto(Banner brand);

    @Mappings({
            @Mapping(target = "text", source = "text") ,
            @Mapping(target = "title", source = "title") ,
            @Mapping(target = "image", expression = "java(fileStorageService.saveTempFile(createBannerRequest.getImage()))")
    })

    public abstract Banner toBanner(CreateBannerRequest createBannerRequest);

    @Mappings({
            @Mapping(target = "id", source = "id") ,
            @Mapping(target = "text", source = "text") ,
            @Mapping(target = "title", source = "title") ,
            @Mapping(target = "image", source = "image")
    })
    public abstract Banner toBanner(UpdateBannerRequest updateBannerRequest);

}

