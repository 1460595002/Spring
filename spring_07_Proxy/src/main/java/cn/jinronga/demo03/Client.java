package cn.jinronga.demo03;

import cn.jinronga.demo03.ProxyInvocationHandler;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/28 0028
 * Time: 21:11
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//租客
public class Client {

    public static void main(String[] args) {
        //真实角色
        Host host=new Host();
        //代理实例的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
          pih.setRent(host); //将真实角色放置进去！
        Rent proxy = (Rent) pih.getProxy();//动态生成对应的代理类！

        proxy.rent();
    }
}
