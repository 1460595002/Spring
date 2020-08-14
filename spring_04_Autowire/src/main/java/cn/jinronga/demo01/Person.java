package cn.jinronga.demo01;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/27 0027
 * Time: 14:13
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Person {
    private  String name;
    @Autowired
    private  Cat cat;
    @Autowired
    private  Dog dog;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }



    public Dog getDog() {
        return dog;
    }



    @Override
    public String toString() {
        return "Proson{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
