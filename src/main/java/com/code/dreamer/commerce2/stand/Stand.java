package com.code.dreamer.commerce2.stand;

import com.code.dreamer.commerce2.domain.AuditMetadata;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@Document
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Stand extends AuditMetadata implements Serializable {
    @Id
    private String id;
    @NotBlank(message = "Stand name can't be blank")
    private String name;


    public Stand(String name) {
        this.name = name;
    }
}
