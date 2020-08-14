import cn.jinronga.mapper.UserMapper;
import cn.jinronga.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/29 0029
 * Time: 22:21
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Test {
    @org.junit.Test
    public void selectUser() throws IOException {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");

        UserMapper userMapper = (UserMapper) context.getBean("userMapper");

        List<User> users = userMapper.selectUser();

        for (User user: users) {
            System.out.println(user);
        }
    }
}
