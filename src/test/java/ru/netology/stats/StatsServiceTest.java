package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test

    // Сумма всех продаж.
    //   public int sumSalesTest(int[] sales) {

    public void shouldSumm() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumm = 180;
        int actualSumm = service.getSumSales(sales);

        Assertions.assertEquals(expectedSumm, actualSumm);
    }

    @Test
    public void shouldAverSumm() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverSumm = 15;
        int actualAverSumm = service.getAveragSummSales(sales);

        Assertions.assertEquals(expectedAverSumm, actualAverSumm);
    }

    @Test
    public void shouldMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.getMaxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);

    }

    @Test
    public void shouldMinSales() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldNumMonthBelowAver() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelovAver = 5;
        int actualBelovAver = service.numMonthBelowAver(sales);
        Assertions.assertEquals(expectedBelovAver, actualBelovAver);
    }

    @Test
    public void shouldNumMonthAboveAver() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveAver = 5;
        int actualAboveAver = service.numMonthAboveAver(sales);
        Assertions.assertEquals(expectedAboveAver, actualAboveAver);
    }


}