import cn.jinronga.demo01.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/27 0027
 * Time: 14:25
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Test {

    @org.junit.Test
    public void  testMethodAutowire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Person person = (Person) context.getBean("person");
        person.getCat().call();
        person.getDog().call();

    }
}
