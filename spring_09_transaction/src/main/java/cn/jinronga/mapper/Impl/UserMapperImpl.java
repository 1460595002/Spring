package cn.jinronga.mapper.Impl;

import cn.jinronga.mapper.UserMapper;
import cn.jinronga.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/30 0030
 * Time: 13:43
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    public List<User> selectUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);

        User user =new User();
        user.setId(26);
        user.setName("Spring事务");
        user.setPwd("12345");
        addUser(user);
        deleteUser(25);
        return mapper.selectUser();
    }

    public int addUser(User user) {

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);

        return mapper.addUser(user);
    }

    public int deleteUser(int id) {

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);

        return  mapper.deleteUser(id);
    }
}
