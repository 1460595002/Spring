package cn.jinronga.demo01;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/27 0027
 * Time: 21:53
 * E-mail:1460595002@qq.com
 * 类说明:
 */
@Component("user")
public class User {

    private String name="金融啊";

    public String getName() {
        return name;
    }
}
