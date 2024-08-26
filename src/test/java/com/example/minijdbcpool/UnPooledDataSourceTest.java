package com.example.minijdbcpool;

import com.example.minijdbcpool.datasource.UnPooledDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/26 17:35
 */
public class UnPooledDataSourceTest{
        @Test
        public void simpleTest() throws SQLException {
            UnPooledDataSource source = new UnPooledDataSource();
            source.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC");
            source.setUser("root");
            source.setPassword("123456");
            Connection connection = source.getConnection();
            System.out.println(connection.getCatalog());
        }
}
