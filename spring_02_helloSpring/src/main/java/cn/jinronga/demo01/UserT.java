package cn.jinronga.demo01;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/25 0025
 * Time: 23:22
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class UserT {
    private  String name;

    public UserT(String name) {
        this.name = name;
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
