package cn.jinronga.demo01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/27 0027
 * Time: 17:11
 * E-mail:1460595002@qq.com
 * 类说明:
 */
@Component("user")
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
@Scope("prototype")
public class User {
    @Value("金融啊")
    private String name;

    public String getName() {
        return name;
    }

}
