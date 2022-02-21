package com.example.details.logging;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class AOPLogger {

    @Pointcut("within(com.example.details.controller..*)")
    public void apiPointcut() {
    }

}
