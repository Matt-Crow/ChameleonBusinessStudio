package com.compilercharisma.chameleonbusinessstudio.dto;

import com.compilercharisma.chameleonbusinessstudio.enumeration.UserRole;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements Serializable {

    private String _id;

    private String displayName;

    private String email;

    private UserRole role;

    private List<String> appointments;

}
