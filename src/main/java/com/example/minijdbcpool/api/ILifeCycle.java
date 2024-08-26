package com.example.minijdbcpool.api;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 生命周期管理
 * @date 2024/8/26 16:34
 */
public interface ILifeCycle {

    /**
     * 生命的初始化
     * @since 1.1.0
     */
    void init();


    /**
     * 生命的销毁
     * @since 1.1.0
     */
    void destroy();
}
