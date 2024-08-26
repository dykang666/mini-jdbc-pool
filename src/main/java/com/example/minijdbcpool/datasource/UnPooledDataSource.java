package com.example.minijdbcpool.datasource;

import com.example.minijdbcpool.util.DriverClassUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/26 17:35
 */
public class UnPooledDataSource extends AbstractDataSourceConfig{
    @Override
    public Connection getConnection() throws SQLException {
        DriverClassUtil.loadDriverClass(super.driverClass, super.jdbcUrl);

        return DriverManager.getConnection(super.getJdbcUrl(),
                super.getUser(), super.getPassword());
    }
}
