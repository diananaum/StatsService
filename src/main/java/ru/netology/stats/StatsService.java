package ru.netology.stats;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StatsService {

    //    public int allSales(int[] sales) {
//        int all = 0;
//        for (int i = 0; i < sales.length; i++) {
//            all = sales[i] + all;
//        }
//        return all;
//    }
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

//    public int averageSales(int[] sales) {
//        int all = 0;
//        int average;
//        for (int i = 0; i < sales.length; i++) {
//            all = sales[i] + all;
//        }
//        return average = all / sales.length;
//    }


    //    public int sumSales(int[] sales) {
//        int all = Arrays.stream(sales).sum();
//        return all;
//    }
//
//    public double averageSales(int[] sales) {
//        double average = Arrays.stream(sales).average().orElse(Double.NaN);
//        return average;
//    }
    
    public long averageSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве

        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

//    public int belowAverage(int[] sales) {
//        int all = 0;
//        int average;
//        int count = 0;
//        for (int i = 0; i < sales.length; i++) {
//            all = sales[i] + all;
//        }
//        average = all / sales.length;
//
//        for (int i = 0; i < sales.length; i++) {
//            if (sales[i] < average) {
//                count++;
//            }
//        }
//        return count;
//    }

    public int belowAverage(long[] sales) {
        long average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }
//    public int aboveAverage(int[] sales) {
//        int all = 0;
//        int average;
//        int count = 0;
//        for (int i = 0; i < sales.length; i++) {
//            all = sales[i] + all;
//        }
//        average = all / sales.length;
//
//        for (int i = 0; i < sales.length; i++) {
//            if (sales[i] > average) {
//                count++;
//            }
//        }
//        return count;
//    }

    public int aboveAverage(long[] sales) {
        long average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
