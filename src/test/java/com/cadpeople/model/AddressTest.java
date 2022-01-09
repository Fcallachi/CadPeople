package com.cadpeople.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddressTest {

    @Test
    void ShouldReturnEqualsWhenComparable() {
        Address actual = new Address(
                "04412090",
                "Rua dos bobos",
                0,
                "Bairro",
                "São Paulo",
                "SP");

        Address expected = new Address(
                "04412090",
                "Rua dos bobos",
                0,
                "Bairro",
                "São Paulo",
                "SP");

        Assertions.assertEquals(actual.getCep(),expected.getCep());
        Assertions.assertEquals(actual.getRoad(),expected.getRoad());
        Assertions.assertEquals(actual.getNumberHouse(),expected.getNumberHouse());
        Assertions.assertEquals(actual.getDistrict(),expected.getDistrict());
        Assertions.assertEquals(actual.getCity(),expected.getCity());
        Assertions.assertEquals(actual.getState(),expected.getState());
    }

    @Test
    void ShouldReturnTrueWhenComparableWithCPFEquals() {
        Address actual = new Address(
                "04412090",
                "Rua dos bobos",
                0,
                "Bairro",
                "São Paulo",
                "SP");

        Address expected = new Address(
                "04412090",
                "Rua dos bobos",
                0,
                "Bairro",
                "São Paulo",
                "SP");

        Assertions.assertEquals(actual,expected);
    }

    @Test
    void ShouldReturnFalseWhenComparableWithCPFEquals() {
        Address actual = new Address(
                "04412090",
                "Rua dos bobos",
                0,
                "Bairro",
                "São Paulo",
                "SP");

        Address expected = new Address(
                "04412090",
                "Rua dos bobos",
                1,
                "Bairro",
                "São Paulo",
                "SP");

        Assertions.assertNotEquals(actual,expected);
    }
}