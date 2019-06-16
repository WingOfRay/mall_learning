package com.okadanana.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.okadanana.mall.mbg.mapper")
public class MyBatisConfig {

}
