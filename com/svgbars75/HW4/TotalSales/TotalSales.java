package com.svgbars75.HW4.TotalSales;

import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите кол-во дней в которые продавали смартфоны :");
        byte n = s.nextByte(); // кол-во дней в которые продавали смартфоны
        System.out.println("Введите кол-во проданных смартфонов GalaxyS24 за " + n + " дней: ");
        byte m1 = s.nextByte(); // кол-во проданных в день GalaxyS24
        System.out.println("Введите кол-во проданных смартфонов GalaxyS23 за " + n + " дней: ");
        byte m2 = s.nextByte(); // кол-во проданных в день GalaxyS23
        System.out.println("Введите кол-во проданных смартфонов GalaxyS24Ultra за " + n + " дней: ");
        byte m3 = s.nextByte(); // кол-во проданных в день GalaxyS24Ultra


        double priceGalaxyS24 = 34999.50; // цена 1-го смартфона GalaxyS24
        double priceGalaxyS23 = 28999.99; // цена 1-го смартфона GalaxyS23
        double priceGalaxyS24Ultra = 52999.41; // цена 1-го смартфона GalaxyS24Ultra
        byte m = (byte) (m1 + m2 + m3); // кол-во всех смартфонов за n дней


        double SumGalaxyS24 = priceGalaxyS24 * m1; // сумма всего за n GalaxyS24
        double SumGalaxyS23 = priceGalaxyS23 * m2; // сумма всего за n GalaxyS23
        double SumDayGalaxyS24Ultra = priceGalaxyS24Ultra * m3; // сумма всего за n GalaxyS24Ultra
        double sumEveryDaySmartphone = (SumGalaxyS24 + SumGalaxyS23 + SumDayGalaxyS24Ultra); // сумма всех проданных смартфонов за n дней

        double priceNDay = sumEveryDaySmartphone / m; // средняя стоимость всех проданных смартфонов за n дней
        System.out.println("Средняя цена смартфонов проданных за " + n + " дней равняется  = " + Math.round(priceNDay * 100.00) / 100.00 + " EUR");
        System.out.println("Абсалютная  сумма от продажи смартфонов за " + n + " дней = " + Math.round(sumEveryDaySmartphone * 100.00) / 100.00 + " EUR");

    }
}