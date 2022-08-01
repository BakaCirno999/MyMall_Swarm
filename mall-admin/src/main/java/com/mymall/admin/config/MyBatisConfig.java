package com.mymall.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 *
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.mymall.mbg.mapper","com.mymall.admin.dao"})
public class MyBatisConfig {
}
