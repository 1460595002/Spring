package cn.jinronga.demo02;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/28 0028
 * Time: 13:50
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Client {

    public static void main(String[] args) {
        //真实对象
        UserServiceImpl userService=new UserServiceImpl();
        //代理对象的调用处理程序
        ProxyInvocationHandler pih=new ProxyInvocationHandler();
        pih.setTarget(userService);//设置被代理的对象

        UserService proxy = (UserService) pih.getProxy();//动态生成代理类
        proxy.delete();
    }
}
