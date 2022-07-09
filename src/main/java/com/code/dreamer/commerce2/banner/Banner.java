/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.dreamer.commerce2.banner;

import com.code.dreamer.commerce2.domain.AuditMetadata;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author Chahir Chalouati
 */

@Data
@Document
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Banner extends AuditMetadata implements Serializable {
    @Id
    private String id;
    @NotBlank(message = "Banner name can't be blank")
    private String name;


    public Banner(String name) {
        this.name = name;
    }
}
