package com.code.dreamer.commerce2.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class MetaDataItem extends AuditMetadata implements Serializable {
    @Id
    private String id;
    private String key;
    private String value;
    private Info infos;


}



