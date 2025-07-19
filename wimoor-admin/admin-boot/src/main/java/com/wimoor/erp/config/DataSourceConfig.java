//package com.wimoor.erp.config;
//
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//
//@Configuration
//public class DataSourceConfig {
//
//    /**
//     * 数据源配置的前缀，必须与application.properties中配置的对应数据源的前缀一致
//     */
//    @Bean
//    @ConfigurationProperties(prefix =  "spring.datasource")
//    public DataSource businessDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//
//}