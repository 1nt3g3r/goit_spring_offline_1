package com.springtest.bean.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShortFormatDateBean implements IDateBean {
    @Override
    public String makeDate() {
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        return format.format(new Date());
    }

    public static void main(String[] args) {
        System.out.println(new ShortFormatDateBean().makeDate());
    }
}
