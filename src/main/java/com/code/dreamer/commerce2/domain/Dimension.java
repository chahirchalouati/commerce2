package com.code.dreamer.commerce2.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/***
 * Created by Chahir Chalouati
 * in 10/19/2021
 */
@Data
@Document
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Dimension extends AuditMetadata implements Serializable {

    @Id
    private String id;
    private Integer width;
    private Integer height;
    private String length;
    private String depth;
    private String prefix;


}
