package com.zerobase.cms.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ServletComponentScan
@EnableJpaRepositories(
        repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class,
        basePackages = "com.zerobase.cms.order"
)
@EnableJpaAuditing
@EnableFeignClients
@SpringBootApplication
public class OrderCmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderCmsApplication.class, args);
    }
}
