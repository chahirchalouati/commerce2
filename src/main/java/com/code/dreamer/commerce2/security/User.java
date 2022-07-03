package com.code.dreamer.commerce2.security;

import com.code.dreamer.commerce2.domain.AuditMetadata;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
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
public class User extends AuditMetadata implements Serializable {
    @Id
    private String id;
    @NotBlank(message = "username is required")
    private String userName;
    @NotBlank(message = "e-mail is required")
    @Email(message = "invalid email")
    private String email;
    @NotBlank(message = "password is required")
    private String password;
    @JsonIgnore
    private Set<Role> roles = new HashSet<>();

}

