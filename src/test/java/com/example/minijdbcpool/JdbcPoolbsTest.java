package com.example.minijdbcpool;

import com.example.minijdbcpool.bs.JdbcPoolBs;
import org.junit.Test;

import javax.sql.DataSource;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/26 16:06
 */
public class JdbcPoolbsTest {
    @Test
    public void bsTest() {
        JdbcPoolBs jdbcPoolBs = JdbcPoolBs.newInstance()
                .username("root")
                .password("123456")
                .url("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC");

        DataSource pooled = jdbcPoolBs.pooled();
        DataSource unPooled = jdbcPoolBs.unPooled();
    }
}
