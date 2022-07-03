package com.code.dreamer.commerce2.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Document
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Info extends AuditMetadata implements Serializable {
    @Id
    private String id;
    private Set<MetaDataItem> data = new HashSet<>();


}
