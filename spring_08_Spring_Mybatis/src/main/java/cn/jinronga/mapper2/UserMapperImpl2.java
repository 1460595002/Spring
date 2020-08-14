package cn.jinronga.mapper2;

import cn.jinronga.mapper.UserMapper;
import cn.jinronga.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/29 0029
 * Time: 23:35
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {


    public List<User> selectUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);

        return   mapper.selectUser();
    }
}
