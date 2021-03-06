package com.plusone.graphql.dto.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class CountryInput implements Serializable {
    @Pattern(regexp = "^[a-zA-Z ]{1,50}$")
    private String countryName;
    @Pattern(regexp = "^[A-Z]{2}$")
    private String countryCode;
    @Pattern(regexp = "^[a-zA-Z ]{1,50}$")
    private String regionName;
}
