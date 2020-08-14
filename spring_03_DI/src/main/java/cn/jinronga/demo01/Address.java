package cn.jinronga.demo01;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/26 0026
 * Time: 21:47
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "地址："+address;
    }
}
