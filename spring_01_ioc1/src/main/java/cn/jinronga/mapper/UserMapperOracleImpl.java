package cn.jinronga.mapper;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/25 0025
 * Time: 16:43
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class UserMapperOracleImpl implements UserMapper{
    @Override
    public void getUser() {
        System.out.println("连接Oracle");
    }
}
