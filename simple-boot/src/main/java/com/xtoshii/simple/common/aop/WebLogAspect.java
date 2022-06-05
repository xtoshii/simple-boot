package com.xtoshii.simple.common.aop;

import eu.bitwalker.useragentutils.UserAgent;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @program: xcs-boot2
 * @description: aop 打印日志
 * @author: xtoshii
 * @create: 2021-06-19 10:57
 **/
@Aspect
@Component
public class WebLogAspect {

    private final static Logger LOGGER = LoggerFactory.getLogger(WebLogAspect.class);

    /**
     * 进入方法时间戳
     */
    private Long startTime;
    /**
     * 方法结束时间戳(计时)
     */
    private Long endTime;

    public WebLogAspect() {
    }


    /**
     * 定义请求日志切入点，其切入点表达式有多种匹配方式,这里是指定路径
     */
    @Pointcut("execution(public * com.xtoshii.simple.controller.*.*(..))")
    public void webLogPointcut() {
    }

    /**
     * 前置通知：
     * 1. 在执行目标方法之前执行，比如请求接口之前的登录验证;
     * 2. 在前置通知中设置请求日志信息，如开始时间，请求参数，注解内容等
     *
     * @param joinPoint
     * @throws Throwable
     */
    @Before("webLogPointcut()")
    public void doBefore(JoinPoint joinPoint) {

        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //获取请求头中的User-Agent
        UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
        //打印请求的内容
        startTime = System.currentTimeMillis();
        LOGGER.info("sessionId:{}", request.getSession().getId());
        LOGGER.info("请求开始时间：{}", LocalDateTime.now());
        LOGGER.info("请求Url : {}", request.getRequestURL());
        LOGGER.info("请求方式 : {}", request.getMethod());
        LOGGER.info("请求ip : {}", request.getRemoteAddr());
        LOGGER.info("请求方法 :{}.{}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        LOGGER.info("请求参数 : {}", Arrays.toString(joinPoint.getArgs()));
        // 系统信息
        LOGGER.info("浏览器：{}", userAgent.getBrowser().toString());
        LOGGER.info("浏览器版本：{}", userAgent.getBrowserVersion());
        LOGGER.info("操作系统: {}", userAgent.getOperatingSystem().toString());
    }

    /**
     * 返回通知：
     * 1. 在目标方法正常结束之后执行
     * 1. 在返回通知中补充请求日志信息，如返回时间，方法耗时，返回值，并且保存日志信息
     *
     * @param ret
     * @throws Throwable
     */
    @AfterReturning(returning = "ret", pointcut = "webLogPointcut()")
    public void doAfterReturning(Object ret) throws Throwable {
        endTime = System.currentTimeMillis();
        LOGGER.info("请求结束时间：{}", LocalDateTime.now());
        LOGGER.info("请求耗时：{}ms", (endTime - startTime));
        // 处理完请求，返回内容
        LOGGER.info("请求返回 : {}", ret);
    }

    /**
     * 异常通知：
     * 1. 在目标方法非正常结束，发生异常或者抛出异常时执行
     * 1. 在异常通知中设置异常信息，并将其保存
     *
     * @param throwable
     */
    @AfterThrowing(value = "webLogPointcut()", throwing = "throwable")
    public void doAfterThrowing(Throwable throwable) {
        // 保存异常日志记录
        LOGGER.error("发生异常时间：{}", LocalDateTime.now());
        LOGGER.error("抛出异常：{}", throwable.toString());
    }
}