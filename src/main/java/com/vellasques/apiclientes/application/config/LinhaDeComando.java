//package com.vellasques.apiclientes.application.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class LinhaDeComando implements CommandLineRunner {
//    @Autowired
//    DataSource hikariDataSource;
//
//    @Override
//    public void run(String... args) throws Exception {
//        hikariDataSource.getConnection().createStatement().execute(
//                "CREATE TABLE users (id INTEGER PRIMARY KEY, name VARCHAR(255) NOT NULL, email VARCHAR(255) NOT NULL)"
//        );
//    }
//}
