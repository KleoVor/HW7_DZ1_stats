package ru.netology.stats;

import org.jetbrains.annotations.NotNull;

public class StatsService {

    // 1. Сумма всех продаж.
    // 2. Средняя суммя продаж в месяц.
    // 3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
    // 4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*.
    // 5. Количество месяцев, в которых продажи были ниже среднего (см. п.2).
    // 6. Количество месяцев, в которых продажи были выше среднего (см. п.2).

    // 1. Сумма всех продаж.
    public int getSumSales(int[] sales) {
        // создаем функцию getSumSales, которая на вход принимает массив из продаж по месяцам с параметром интового типа sales

        int summ = 0;
        for (int i = 0; i < sales.length; i++) {
            summ = summ + sales[i];
        }
        return summ;
    }

    // 2. Средняя суммя продаж в месяц.

    public int getAveragSummSales(int[] sales) {
        int AverSumm = getSumSales(sales) / sales.length;
        return AverSumm;

    }

    // 3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.

    public int getMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            //sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }


    // 4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*.

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            //sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    // 5. Количество месяцев, в которых продажи были ниже среднего (см. п.2).

    public int numMonthBelowAver(int[] sales) {
        int numMonth = 0;
        int AverSumm = getAveragSummSales(sales);


        for (int sale : sales) {
            if (AverSumm > sale) {
                numMonth = numMonth + 1;
            }
        }
        return numMonth;
    }

    // 6. Количество месяцев, в которых продажи были выше среднего (см. п.2).

    public int numMonthAboveAver(int[] sales) {
        int numMonth = 0;
        int AverSumm = getAveragSummSales(sales);


        for (int sale : sales) {
            if (AverSumm < sale) {
                numMonth = numMonth + 1;
            }
        }
        return numMonth;
    }

}

