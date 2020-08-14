package cn.jinronga.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/29 0029
 * Time: 15:31
 * E-mail:1460595002@qq.com
 * 类说明:
 */
@Aspect //这是一个切面类
public class AnnotationPointcut {

    @Before("execution(* cn.jinronga.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("========方法执行前=======");
    }
    @After("execution(* cn.jinronga.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("========方法执行后=======");

    }
    //
    @Around("execution(* cn.jinronga.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名:"+jp.getSignature());
        //执行目标方法proceed
        Object proceed = jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
