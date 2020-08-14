package cn.jinronga.demo02;

import cn.jinronga.mapper.UserMapper;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/25 0025
 * Time: 16:07
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class UserServiceImpl implements UserService{

    private  UserMapper userMapper;

    public void SetUser(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void getUser() {
      userMapper.getUser();
    }
}
