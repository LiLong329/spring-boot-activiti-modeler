package com.jerryl.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 类名称：ParamLock<br>
 * 类描述：<br>
 * 创建时间：2018年12月27日<br>
 *
 * @author lichao
 * @version 1.0.0
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface ParamLock {


}
