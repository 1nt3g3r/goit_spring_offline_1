package com.springtest.bean.runner.annotation;

import com.springtest.bean.service.DatePrintService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationSpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringAnnotationConfig.class);
        ctx.register(DatePrintService.class);

        DatePrintService datePrintService = ctx.getBean(DatePrintService.class);
        datePrintService.printDate();
    }
}
