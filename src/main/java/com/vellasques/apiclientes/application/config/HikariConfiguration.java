package com.vellasques.apiclientes.application.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.Properties;
import java.util.logging.Logger;

public class HikariConfiguration {

    @Value("${spring.datasource.username")
    private String username;

    @Value("${spring.datasource.password")
    private String password;

    @Value("${spring.datasource.datasource-name")
    private String dataSourceName;

    @Value("${spring.datasource.port")
    private String port;

    @Value("${spring.datasource.url")
    private String url;

    @Autowired
    Logger logger;

    @Bean
    public DataSource dataSource() {
        HikariConfig hikariConfig;
        Properties properties = new Properties();

        try {
            properties.setProperty(dataSourceName, port);
            hikariConfig = new HikariConfig(properties);

            hikariConfig.setJdbcUrl(this.url);
            hikariConfig.setUsername(this.username);
            hikariConfig.setPassword(this.password);
            hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
            hikariConfig.setConnectionTimeout(5000); // 5 segundos
            hikariConfig.setMaximumPoolSize(10);
            hikariConfig.setPoolName("MyHikariCP");
        } catch (Exception e) {
            logger.info("Conexão com banco de dados" + "Falha ao conectar ao banco de dados" + e.getLocalizedMessage());
            e.printStackTrace();
            throw e;
        }

        return new HikariDataSource(hikariConfig);
    }
}
