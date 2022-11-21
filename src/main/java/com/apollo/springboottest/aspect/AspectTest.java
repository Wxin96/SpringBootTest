package com.apollo.springboottest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectTest {

    @Pointcut("execution(* com.apollo.springboottest.controller.DemoController.hello(..))") // 切入点表达式
    private void definePointcut() {}// 方法签名



    @Around("definePointcut()")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("before");
        Object proceed = null;
        try {
            // 执行方法
            proceed = proceedingJoinPoint.proceed();
        } catch (Throwable t) {
            t.printStackTrace();
        }
        System.out.println("after");
        return proceed;
    }



}
