package com.opencart.repository;

import com.opencart.datamodel.QuantityModel;
import org.apache.commons.lang3.RandomStringUtils;

public class QuantityModelRepository {

    private QuantityModelRepository(){

    }
    public static QuantityModel getQuantityModel(){
        return QuantityModel.builder()
                .quantity(RandomStringUtils.randomNumeric(1))
                .build();
    }
}