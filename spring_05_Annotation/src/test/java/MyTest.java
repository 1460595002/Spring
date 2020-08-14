import cn.jinronga.demo01.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/27 0027
 * Time: 17:16
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class MyTest {
    @Test
    public void Annotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.getName());
    }
}
