package com.jerryl.common;

import java.lang.annotation.*;

/**
 * 类名称：Lock<br>
 * 类描述：<br>
 * 创建时间：2018年12月26日<br>
 *
 * @author lichao
 * @version 1.0.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Lock {
    String value();

}
