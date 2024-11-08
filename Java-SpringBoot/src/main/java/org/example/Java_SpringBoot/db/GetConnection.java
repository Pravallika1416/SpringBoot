package org.example.Java_SpringBoot.db;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Configuration
//makes myclass eligible for creating beans

public class GetConnection {
    //make bean of connection
    // if i want to make a bean of a predefined class then I can use @Bean annotation
    @Bean
    public Connection connection(){
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb", "root", "root");
        return connection;
        }catch(SQLException e){
            throw new RuntimeException(e.getMessage());
        }

    }
}
