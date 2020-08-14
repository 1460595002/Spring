import cn.jinronga.demo01.Hello;
import cn.jinronga.demo01.User;
import cn.jinronga.demo01.UserT;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/25 0025
 * Time: 21:22
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class MyTest {
    @Test
    public void helloSpring(){

        //解析beans.xml文件，生成管理相对应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       //getBean()参数为spring配置文件中的bean中id
      Hello hello =  (Hello) context.getBean("hello");
      hello.show();

    }

    @Test
    public void user(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //在执行getBean的时候，user已经创建好了，通过无参构造
        User user =(User) context.getBean("user");
//        //调用对象的方法
//         user.show();
    }

    @Test
    public void userT(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserT userT = (UserT)context.getBean("userNew");
        userT.show();

    }
}
