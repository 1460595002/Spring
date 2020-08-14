package cn.jinronga.mapper;

import cn.jinronga.pojo.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/29 0029
 * Time: 22:17
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public interface UserMapper {
    //查询所有用户
    List<User> selectUser();

}
