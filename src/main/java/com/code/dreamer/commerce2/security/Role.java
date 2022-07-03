package com.code.dreamer.commerce2.security;

import com.code.dreamer.commerce2.domain.AuditMetadata;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/***
 * Created by Chahir Chalouati
 * in 10/31/2021
 */
@Data
@Document
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Role extends AuditMetadata implements Serializable {
    @Id
    private Integer id;
    @NotBlank(message = "authority can't be blank")
    private String name;
    private boolean enabled;

}
