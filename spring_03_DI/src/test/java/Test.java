import cn.jinronga.demo01.Student;
import cn.jinronga.demo01.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/26 0026
 * Time: 22:08
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Test {
    @org.junit.Test
    public void springDI(){
     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");

        System.out.println(student.getName());
        System.out.println(student.getAddress());

       student.show();
    }

    @org.junit.Test
    public void user(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) context.getBean("user2");
        User user2 = (User) context.getBean("user2");
        System.out.println(user==user2);
    }
}
