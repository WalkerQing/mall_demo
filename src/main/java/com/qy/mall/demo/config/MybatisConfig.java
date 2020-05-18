package com.qy.mall.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.qy.mall.demo.mbg.mapper","com.qy.mall.demo.dao"})
public class MybatisConfig {
}
