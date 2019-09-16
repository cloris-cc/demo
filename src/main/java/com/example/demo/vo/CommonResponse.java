package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jacky
 * Date: 2019/8/28 15:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse<T> {
    private Integer code;
    private T data;
    private Boolean success;
    private String message;

    public CommonResponse(Integer code, Boolean success, String message){
        this.code = code;
        this.success = success;
        this.message = message;
    }
}
