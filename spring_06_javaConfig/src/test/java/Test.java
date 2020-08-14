import cn.jinronga.Config.MyConfig;
import cn.jinronga.demo01.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/27 0027
 * Time: 21:56
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Test {
    @org.junit.Test
    public void Myconfig1(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        User user = (User) context.getBean("user");
        System.out.println(user.getName());
    }
}
