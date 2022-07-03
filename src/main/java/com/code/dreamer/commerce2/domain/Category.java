package com.code.dreamer.commerce2.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Set;

/**
 * @author Chahir Chalouati
 */
@Data
@Document
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Category extends AuditMetadata implements Serializable {
    @Id
    private String id;
    @NotBlank(message = "Category name can't be blank")
    private String name;

    private Set<SubCategory> subCategories;
    private Set<Style> styles;


}
