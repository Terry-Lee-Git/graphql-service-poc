package com.plusone.graphql.dto;

import io.leangen.graphql.annotations.GraphQLId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department implements Serializable {
    @GraphQLId
    private Long departmentId;
    private String departmentName;
    private Location location;
}

