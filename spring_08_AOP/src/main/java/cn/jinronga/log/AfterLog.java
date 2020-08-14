package cn.jinronga.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/29 0029
 * Time: 11:19
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class AfterLog implements AfterReturningAdvice {
    //returnValue:返回值
    //method：调用的方法
    //args:被调用方法的对象参数
    //被调用的目标对象
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+target.getClass().getName()+"的"+method.getName()+"方法 "+"返回值"+returnValue);
    }
}
