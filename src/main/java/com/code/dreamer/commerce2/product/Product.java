/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.dreamer.commerce2.product;

import com.code.dreamer.commerce2.brand.Brand;
import com.code.dreamer.commerce2.domain.*;
import com.code.dreamer.commerce2.payment.Price;
import com.code.dreamer.commerce2.stand.Stand;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
public class Product extends AuditMetadata implements Serializable {
    @Id
    private String id;
    @NotNull(message = "Product name can't be null")
    @NotBlank(message = "Product name can't be blank")
    private String name;
    @NotNull(message = "Product code can't be null")
    @NotBlank(message = "Product code can't be blank")
    private String code;
    private Set<File> files = new HashSet<>();
    @NotNull(message = "Product description code can't be null")
    @NotBlank(message = "Product description can't be blank")
    private String description;
    private String internalNote;
    private Boolean hasDiscount;
    private Boolean isInOutlet;
    private Boolean hasVisibleBrand;
    private Boolean hasBanner;
    private Boolean isDeliverable;
    private Location location;
    private Stand stand;
    private Measurement measurement;
    private Brand brand;
    private Category category;
    private Price price;
}
