package com.example.minijdbcpool;

import com.example.minijdbcpool.datasource.PooledDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/26 17:49
 */
public class PooledDataSourceTest {
    @Test
    public void simpleTest() throws SQLException {
        PooledDataSource source = new PooledDataSource();
        source.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC");
        source.setUser("root");
        source.setPassword("123456");
        source.setMinSize(1);

        // 初始化
        source.init();

        Connection connection = source.getConnection();
        System.out.println(connection.getCatalog());

        Connection connection2 = source.getConnection();
        System.out.println(connection2.getCatalog());
    }
}
