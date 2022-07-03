package com.code.dreamer.commerce2.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/***
 * Created by Chahir Chalouati
 * in 11/7/2021
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
