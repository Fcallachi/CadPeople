package com.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;

class PeopleTest {


    @Test
    void ShouldReturnEqualsWhenComparable() {
        SimpleDateFormat date = new SimpleDateFormat ("05-06-2000");

        People actual = new People(
                "Fernando",
                "Callachi",
                "12345678910",
                date);

        People expected = new People(
                "Fernando",
                "Callachi",
                "12345678910",
                date);


        Assertions.assertEquals(actual.getName(), expected.getName());
        Assertions.assertEquals(actual.getSurname(), expected.getSurname());
        Assertions.assertEquals(actual.getCpf(), expected.getCpf());
        Assertions.assertEquals(actual.getDataNasc(), expected.getDataNasc());
    }

    @Test
    void ShouldReturnTrueWhenComparableWithCPFEquals() {
        SimpleDateFormat date = new SimpleDateFormat();

        People actual = new People(
                "Fernando",
                "Callachi",
                "12345678910",
                date);

        People expected = new People(
                "Marcio",
                "Dantas",
                "12345678910",
                date);

        Assertions.assertEquals(actual,expected);
    }

    @Test
    void ShouldReturnFalseWhenComparableWithCPFEquals() {
        SimpleDateFormat date = new SimpleDateFormat();

        People actual = new People(
                "Fernando",
                "Callachi",
                "12345678910",
                date);

        People expected =  new People(
                "Fernando",
                "Callachi",
                "10987654321",
                date);

        Assertions.assertNotEquals(actual,expected);
    }
}