package cn.jinronga.mapper;

import cn.jinronga.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/30 0030
 * Time: 13:29
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public interface UserMapper {
    //查询所有用户
    List<User> selectUser();
    //添加用户
    int addUser(User user);
    //根据id删除用户
    int deleteUser(@Param("id") int id);

}
