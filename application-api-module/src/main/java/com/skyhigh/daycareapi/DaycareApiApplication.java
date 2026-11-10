package com.skyhigh.daycareapi;

import com.skyhigh.daycareapi.billing.billingapimodule.model.ChildPaymentEnrollment;
import com.skyhigh.daycareapi.billing.billingapimodule.model.FeePlan;
import com.skyhigh.domainmodule.model.Child;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
        "com.skyhigh.daycareapi",
        "com.skyhigh.domainmodule"
})
@ComponentScan(basePackages = {
        "com.skyhigh.daycareapi.swagger",
        "com.skyhigh.daycareapi.controller",
        "com.skyhigh.daycareapi.service",
        "com.skyhigh.daycareapi.repository",
        "com.skyhigh.daycareapi.config.swagger",
        "com.skyhigh.daycareapi.util.convertor",
        "com.skyhigh.daycareapi.billing"
})
@EntityScan(basePackages = {
        "com.skyhigh.daycareapi",
        "com.skyhigh.domainmodule"
})
@EnableJpaRepositories(basePackages = {
        "com.skyhigh.daycareapi",
        "com.skyhigh.domainmodule"
})
public class DaycareApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaycareApiApplication.class, args);
    }

}
