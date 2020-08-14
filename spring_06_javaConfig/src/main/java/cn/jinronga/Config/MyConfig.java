package cn.jinronga.Config;

import cn.jinronga.demo01.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/27 0027
 * Time: 21:53
 * E-mail:1460595002@qq.com
 * 类说明:
 */
@Configuration  //代表这是一个配置类就和之前的beans.xml一样的
@ComponentScan("cn.jinronga.demo01")
@Import(MyConfig2.class)//导入合并其他配置类，类似于配置文件中的 inculde 标签
public class MyConfig {

  @Bean //通过方法注册一个bean，这里的返回值就Bean的类型，方法名就是bean的id！
    public User user() {

      return new User();
  }

}
