package com.example.minijdbcpool.datasource;

import com.example.minijdbcpool.api.IDataSourceConfig;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/26 16:25
 */
public class DataSourceConfigAdaptor implements IDataSourceConfig {


    @Override
    public void setDriverClass(String driverClass) {

    }

    @Override
    public void setJdbcUrl(String jdbcUrl) {

    }

    @Override
    public void setUser(String user) {

    }

    @Override
    public void setPassword(String password) {

    }

    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
