package com.spartaglobal.jacksonRates.deserialiserates;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;

public class RateDeserialiser {
    public RatesDTO rateMapped;

    public RateDeserialiser(String fileLocation) {
        ObjectMapper objectMapper = new ObjectMapper();

        try{
            rateMapped = objectMapper.readValue(new FileReader(fileLocation), RatesDTO.class);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
