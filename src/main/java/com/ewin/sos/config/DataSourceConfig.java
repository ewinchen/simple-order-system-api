package com.ewin.sos.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.ewin.sos.mapper", sqlSessionTemplateRef = "sqlSessionTemplate")
public class DataSourceConfig {

}
