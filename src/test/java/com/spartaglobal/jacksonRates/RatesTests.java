package com.spartaglobal.jacksonRates;

import com.spartaglobal.jacksonRates.deserialiserates.RateDeserialiser;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class RatesTests {

    private static RateDeserialiser rates;

    @BeforeClass
    public static void setup(){
        rates = new RateDeserialiser("resources/rates.json");
    }

    @Test
    public void testSuccessIsTrue(){
        Assert.assertTrue(rates.rateMapped.success);
    }
}
