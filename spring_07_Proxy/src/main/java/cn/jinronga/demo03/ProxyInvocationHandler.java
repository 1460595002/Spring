package cn.jinronga.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/28 0028
 * Time: 16:37
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//代理角色
public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成代理类，重点是第二个参数，获取要代理的抽象角色！之前都是一个角色，现在可以代理一类角色
    public Object getProxy(){
        //通过反射获取类
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }




    // proxy : 代理类 method : 代理类的调用处理程序的方法对象.
    // 处理代理实例上的方法调用并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        //核心：本质利用反射实现！
        Object result = method.invoke(rent, args);

        return result;
    }

    public void log(String methodName){
        System.out.println("执行了"+methodName+"方法");
    }
}
