package domain;

import bean.User;
import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.NonNull;
import lombok.SneakyThrows;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;

@Log4j2
@Log
@Log4j
@Slf4j
@XSlf4j
public class test {
    //自动接收异常检查
    @SneakyThrows
    public static void main(String[] args) {
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        user.setPhone("123456");
        user.setAddress("xxxx");
        user.setSex("男");
        user.setSex("2018-08-23");
        System.out.println(user);

        User user2 = new User();
        user2.setName("李四");
        user2.setAge(18);
        user2.setPhone("123456");
        user2.setAddress("xxxxxxx");
        user2.setSex("男");
        user2.setSex("2018-08-23");
        System.out.println(user2.equals(user));
        System.out.println();

        user2.builder().name("s").age(18);

        /*User user3 = null;
        new test().show(user3);*/
        System.out.println();



    }

    public void show(@NonNull User user) {
        /*if (user == null) {
            throw new NullPointerException("user");
        }*/
        System.out.println(user.getName());
    }
}
