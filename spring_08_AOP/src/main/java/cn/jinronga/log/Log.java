package cn.jinronga.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/29 0029
 * Time: 11:10
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Log implements MethodBeforeAdvice {
    //method：要执行的目标对象的方法
    //objects:被调用方法的参数
    //target:目标对象
    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {

        System.out.println(target.getClass().getName()+"的"+method.getName()+"方法被执行了");

    }
}
