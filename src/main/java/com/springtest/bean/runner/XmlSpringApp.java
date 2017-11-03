package com.springtest.bean.runner;

import com.springtest.bean.service.DatePrintService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlSpringApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml", "services.xml");
        DatePrintService datePrintService = context.getBean("printDateService", DatePrintService.class);
        datePrintService.printDate();
    }
}
