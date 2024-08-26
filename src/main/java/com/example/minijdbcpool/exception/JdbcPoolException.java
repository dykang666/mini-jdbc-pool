package com.example.minijdbcpool.exception;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/26 17:02
 */
public class JdbcPoolException extends RuntimeException{

    public JdbcPoolException() {
    }

    public JdbcPoolException(String message) {
        super(message);
    }

    public JdbcPoolException(String message, Throwable cause) {
        super(message, cause);
    }

    public JdbcPoolException(Throwable cause) {
        super(cause);
    }

    public JdbcPoolException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
