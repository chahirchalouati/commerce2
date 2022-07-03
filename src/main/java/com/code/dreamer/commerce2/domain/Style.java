package com.code.dreamer.commerce2.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Chahir Chalouati
 */
@Data
@Document
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Style extends AuditMetadata implements Serializable {

    @Id
    private String id;
    private String name;


    private Set<Category> categories = new HashSet<>();

    public Style(String name) {
        this.name = name;
    }
}
