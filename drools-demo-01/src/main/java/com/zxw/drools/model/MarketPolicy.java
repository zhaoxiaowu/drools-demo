package com.zxw.drools.model;

import lombok.Data;
import lombok.ToString;

/**
 * 营销策略
 *
 * @author: wuhongyun
 * @date: 2021/1/31
 */
@Data
@ToString
public class MarketPolicy {
    private String sex;            // 性别；男、女
    private Integer age;           // 年龄
    private Boolean userSingle;    // 单身；是/否
    private Boolean userMarry;     // 结婚；是/否
    private Boolean userParenting; // 育儿；是/否
}
