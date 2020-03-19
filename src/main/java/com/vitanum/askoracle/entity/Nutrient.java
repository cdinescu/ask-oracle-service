package com.vitanum.askoracle.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nutrient {
    @Field("Description")
    private String description;

    @Field("Measure")
    private String measure;

    @Field("Quantity")
    private String quantity;
}
