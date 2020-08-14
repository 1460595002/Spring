package cn.jinronga.mapper.Impl;

import cn.jinronga.mapper.UserMapper;
import cn.jinronga.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/29 0029
 * Time: 23:35
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class UserMapperImpl implements UserMapper {

    //sqlSession不用我们自己创建了，Spring来管理
    private SqlSessionTemplate sessionTemplate;

    public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }

    public List<User> selectUser() {
        UserMapper mapper = sessionTemplate.getMapper(UserMapper.class);

        return   mapper.selectUser();
    }
}
