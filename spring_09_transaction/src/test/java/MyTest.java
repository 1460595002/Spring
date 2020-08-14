import cn.jinronga.mapper.UserMapper;
import cn.jinronga.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/30 0030
 * Time: 13:53
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class MyTest {

    @Test
    public void test(){

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-dao.xml");

        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        List<User> users = userMapper.selectUser();

        System.out.println(users);

    }
}
