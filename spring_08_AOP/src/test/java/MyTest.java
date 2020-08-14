import cn.jinronga.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/29 0029
 * Time: 11:44
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        UserService userService = (UserService) context.getBean("userService");

        userService.add();
    }
}
