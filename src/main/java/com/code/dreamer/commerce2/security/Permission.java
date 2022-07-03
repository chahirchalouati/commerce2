/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.dreamer.commerce2.security;

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
public class Permission extends AuditMetadata implements Serializable {

    @Id
    private Integer id;
    @NotBlank(message = "authority can't be blank")
    private String name;
    private boolean enabled;
}
