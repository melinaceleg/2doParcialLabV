package com.parciallabv.parcialLabV.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    private Integer country_id;
    private String name;
    private String country_code;
    private String continent;


}
