package cn.jinronga.demo01;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/28 0028
 * Time: 10:30
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//客户类，一般客户都会去找代理！
public class Client {
    public static void main(String[] args) {
        //房东要租房
        Host host = new Host();
        //中介帮助房东
        Proxy proxy=new Proxy(host);
        //我去找中介租房！
        proxy.rent();
    }
}
