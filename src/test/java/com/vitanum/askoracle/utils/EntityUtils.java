package com.vitanum.askoracle.utils;

import com.vitanum.askoracle.entity.Nutrient;

public class EntityUtils {

    private EntityUtils() {

    }

    public static void decorateEntity(Nutrient theNutrient) {
        theNutrient.setDescription("Description");
        theNutrient.setDescription("1.0 oz");
        theNutrient.setQuantity("30");
    }
}
