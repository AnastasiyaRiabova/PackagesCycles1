package ru.netology.services.PackagesCycles1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RestAmountServiceTest {

    @Test
    public void numberMonthsRestOneTest() {
        RestAmountService service = new RestAmountService();

        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberMonthsRestTwoTest() {
        RestAmountService service = new RestAmountService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }
}
