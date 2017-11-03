package com.springtest.bean.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FullFormatDateBean implements IDateBean {
    private static final String[] MONTHS = {
            "Січень",
            "Лютий",
            "Березень",
            "Квітень",
            "Травень",
            "Червень",
            "Липень",
            "Серпень",
            "Вересень",
            "Жовтень",
            "Листопад",
            "Грудень"
    };

    @Override
    public String makeDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        StringBuilder builder = new StringBuilder();
        builder.append("Сьогодні ").append(MONTHS[month]).append(", ").append(day).append(" число, рік ").append(year);
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new FullFormatDateBean().makeDate());
    }
}
