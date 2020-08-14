package cn.jinronga.config;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/29 0029
 * Time: 14:51
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class DiyPointcut {

    public void before(){
        System.out.println("========方法执行前=======");
    }

    public void after(){
        System.out.println("========方法执行后=======");

    }
}
