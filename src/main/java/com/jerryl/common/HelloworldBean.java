package com.jerryl.common;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 类名称：HelloworldBean<br>
 * 类描述：<br>
 * 创建时间：2018年12月26日<br>
 *
 * @author lichao
 * @version 1.0.0
 */
@Component
public class HelloworldBean {

    @Lock(value = "#emp.name")
    public String a(Emp emp) {
        return null;
    }

}
