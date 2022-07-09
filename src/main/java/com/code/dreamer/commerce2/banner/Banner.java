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
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.nativex.hint.FieldHint;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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

    @NotNull(message = "banner title can't be Null")
    @NotBlank(message = "banner title can't be blank")
    private String title;

    @NotNull(message = "banner text can't be Null")
    @NotBlank(message = "banner text can't be blank")
    private String text;

    @NotNull(message = "banner image can't be Null")
    @NotBlank(message = "banner image can't be blank")
    private String image;
}
