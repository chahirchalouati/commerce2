package com.code.dreamer.commerce2.common;

import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

/***
 * Created by Chahir Chalouati
 * in 10/10/2021
 */
@MapperConfig(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IgnoreUnmappedMapperConfig {
}
