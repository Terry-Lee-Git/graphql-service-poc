package com.plusone.graphql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountriesPaginated implements Serializable {
    private List<Country> content;
    private PageInfo paging;
}
