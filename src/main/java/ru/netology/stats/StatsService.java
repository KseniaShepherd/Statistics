package ru.netology.stats;

public class StatsService {

    public long salesSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        return salesSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calculateQtvMonthWithLowSales(long[] sales) {
        int qtvMonthWithLowSales = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                qtvMonthWithLowSales++;
            }
        }
        return qtvMonthWithLowSales;
    }
    public int calculateQtvMonthWithHighSales(long[] sales) {
        int qtvMonthWithLowSales = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                qtvMonthWithLowSales++;
            }
        }
        return qtvMonthWithLowSales;
    }
}
