package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void salesSum() {
        StatsService statsService = new StatsService();
        long actual = statsService.salesSum(sales);
        long expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    void averageSales() {
        StatsService statsService = new StatsService();
        long actual = statsService.averageSales(sales);
        long expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatsService statsService = new StatsService();
        long actual = statsService.maxSales(sales);
        long expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatsService statsService = new StatsService();
        long actual = statsService.minSales(sales);
        long expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void calculateQtvMonthWithLowSales() {
        StatsService statsService = new StatsService();
        long actual = statsService.calculateQtvMonthWithLowSales(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void calculateQtvMonthWithHighSales() {
        StatsService statsService = new StatsService();
        long actual = statsService.calculateQtvMonthWithHighSales(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }
}