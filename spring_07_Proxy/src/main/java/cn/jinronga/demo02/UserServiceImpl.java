package cn.jinronga.demo02;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/28 0028
 * Time: 13:40
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class UserServiceImpl implements UserService{
    public void add() {
        System.out.println("添加了另一个用户");
    }

    public void update() {

        System.out.println("更新用户");
    }

    public void delete() {
        System.out.println("删除用户");
    }

    public void query() {
        System.out.println("查询用户");
    }
    //1.改动原有的业务代码，在公司中是大忌！
}
