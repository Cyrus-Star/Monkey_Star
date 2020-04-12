package com.tensquare.article;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

@SpringBootApplication
//配置Mapper包扫描
@MapperScan("com.tensquare.article.dao")
@EnableEurekaClient
//添加Fegin客户端
@EnableFeignClients
public class ArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticleApplication.class, args);
    }

    @Bean
    public IdWorker createIdWorker() {
        return new IdWorker(1, 1);
    }

}
