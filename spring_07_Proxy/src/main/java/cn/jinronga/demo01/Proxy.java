package cn.jinronga.demo01;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/28 0028
 * Time: 10:29
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//代理角色：中介
public class Proxy implements Rent{
    private  Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }


    public void rent() {
        host.rent();
        showHouse();
        contract();
    }

    public void showHouse(){
        System.out.println("中介带租客看房子");
    }
    public void contract(){
        System.out.println("签合同");
    }

}
