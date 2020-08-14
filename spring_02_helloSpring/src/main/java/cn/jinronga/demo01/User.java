package cn.jinronga.demo01;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/25 0025
 * Time: 22:53
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class User {
    private String name;

    public User() {
        System.out.println("我已经被初始化了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("用户名："+name);
    }
}
