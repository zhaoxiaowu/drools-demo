package com.zxw.drools;

import lombok.Data;
import lombok.ToString;

/**
 * @author: wuhongyun
 * @date: 2021/1/31
 */
@Data
@ToString
public class Result {
    private String code;
    private String message;

    public void setResult(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
