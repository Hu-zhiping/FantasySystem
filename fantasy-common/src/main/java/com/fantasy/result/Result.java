package com.fantasy.result;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    private Integer code;
    private T data;
    private String message;

    public static <T> Result<T> success() {
        return new Result<>(200, null, "成功");
    }

    public static <T> Result<T> success(T data, String message) {
        return new Result<>(200, data, message);
    }

    public Result(Integer code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }
}
