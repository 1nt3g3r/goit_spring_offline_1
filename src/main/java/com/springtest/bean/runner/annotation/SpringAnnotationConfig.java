package com.springtest.bean.runner.annotation;

import com.springtest.bean.date.FullFormatDateBean;
import com.springtest.bean.date.IDateBean;
import com.springtest.bean.date.ShortFormatDateBean;
import com.springtest.bean.service.DatePrintService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringAnnotationConfig {
    @Bean
    public IDateBean shortFormatDateBean() {
        return new ShortFormatDateBean();
    }

    @Primary
    @Bean
    public IDateBean fullFormatDateBean() {
        return new FullFormatDateBean();
    }
}
