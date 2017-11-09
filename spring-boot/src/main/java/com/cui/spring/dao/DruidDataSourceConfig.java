/*
package com.cui.spring.dao;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.logging.Log;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import javax.sql.DataSource;
import java.sql.SQLException;
import org.springframework.core.env.Environment;
*/
/**
 * Created by cjs
 * Date： 2017/7/12.
 * Time： 11:34.
 *//*

public class DruidDataSourceConfig  implements EnvironmentAware {
    private static Logger logger = LogManager.getLogger(DruidDataSourceConfig.class.getName());
    private RelaxedPropertyResolver propertyResolver;

    public void setEnvironment(Environment env) {
        this.propertyResolver = new RelaxedPropertyResolver(env, "spring.datasource.");
    }

    @Bean
    public DataSource dataSource() {
        logger.info("注入druid！！！");
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(propertyResolver.getProperty("url"));
        datasource.setDriverClassName(propertyResolver.getProperty("driver-class-name"));
        datasource.setInitialSize(Integer.valueOf(propertyResolver.getProperty("initial-size")));
        datasource.setMinIdle(Integer.valueOf(propertyResolver.getProperty("min-idle")));
        datasource.setMaxWait(Long.valueOf(propertyResolver.getProperty("max-wait")));
        datasource.setMaxActive(Integer.valueOf(propertyResolver.getProperty("max-active")));
        datasource.setMinEvictableIdleTimeMillis(Long.valueOf(propertyResolver.getProperty("min-evictable-idle-time-millis")));
        try {
            datasource.setFilters("stat,wall");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datasource;
    }
}
*/