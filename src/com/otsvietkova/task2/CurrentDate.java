package com.otsvietkova.task2;

import java.time.LocalDate;

public class CurrentDate {

    public static void main(String[] args) {

        var date = LocalDate.now();

        int monthsCount = 1;
        int yearsCount = 1;
        int dayCount = 1;

       LocalDate dateAfterYearModification = date.plusYears(yearsCount);
       LocalDate dateAfterMonthModification = dateAfterYearModification.plusMonths(monthsCount);
       LocalDate dateAfterDayModification = dateAfterMonthModification.plusDays(dayCount);

        //LocalDate resultDate = date.plusYears(1).plusMonths(1).plusDays(1);

        System.out.println(date);
        System.out.println("============");
        //System.out.println(dateAfterYearModification);
        //System.out.println(dateAfterMonthModification);
        System.out.println(dateAfterDayModification);

        //System.out.println(resultDate);
    }
}
