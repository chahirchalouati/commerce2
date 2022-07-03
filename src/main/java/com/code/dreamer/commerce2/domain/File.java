/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.dreamer.commerce2.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
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
public class File extends AuditMetadata implements Serializable {


    @Id
    private String id;
    @NotBlank(message = "Name can't be blank")
    private String name;
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;
    @NotBlank(message = "URI can't be blank")
    private String URL;

    @NotBlank(message = "PATH can't be blank")
    private String path;
    private Long length;
    private FileType fileType;
    private ImageSize size;
    @JsonProperty(value = "files")
    private Set<File> resizedFiles = new HashSet<>();
    private Dimension dimension;

    public File(String name , String URL , String path) {
        this.name = name;
        this.URL = URL;
        this.path = path;
    }
}
