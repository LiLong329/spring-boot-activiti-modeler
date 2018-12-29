package com.jerryl.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 类名称：LockAop<br>
 * 类描述：<br>
 * 创建时间：2018年12月27日<br>
 *
 * @author lichao
 * @version 1.0.0
 */
@Aspect
@Component
public class LockAop {

    ExpressionParser parser = new SpelExpressionParser();
    LocalVariableTableParameterNameDiscoverer discoverer = new LocalVariableTableParameterNameDiscoverer();

    @Around(value = "@annotation(annotaion)")
    public void lock(ProceedingJoinPoint joinPoint, Lock annotaion) throws Throwable {
        Object[] args = joinPoint.getArgs();
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        String value = annotaion.value();
        String[] param = discoverer.getParameterNames(method);
        EvaluationContext context = new StandardEvaluationContext();
        for (int i = 0; i < param.length; i++) {
            context.setVariable(param[i], args[i]);
        }

        Expression expression = parser.parseExpression(value);
        System.out.println("#########:" + expression.getValue(context, String.class));

        joinPoint.proceed();
    }

}
