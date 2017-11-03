package com.springtest.bean.service;

import com.springtest.bean.date.IDateBean;
import org.springframework.beans.factory.annotation.Autowired;

public class DatePrintService {
    private IDateBean dateBean;

    @Autowired
    public DatePrintService(IDateBean dateBean) {
        this.dateBean = dateBean;
    }

    public void printDate() {
        System.out.println(dateBean.makeDate());
    }
}
