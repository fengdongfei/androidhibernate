package com.example.fengdongfei.drawercaven;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import io.beanmapper.BeanMapper;

/**
 * Created by fengdongfei on 2017/6/29.
 */

public class BeanUtilTest {
    static Map<String, Object> mp;
    public static void main(String[] args) {
        PersonBean person = new PersonBean();

        mp = new HashMap<String, Object>();
        mp.put("name", "Mike");
        mp.put("age", 25);
        mp.put("mN", "male");


        for (Map.Entry<String, Object> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("name: " + person.getName());
        System.out.println("age: " + person.getAge());
        System.out.println("mN: " + person.getmN());


        for (Map.Entry<String, Object> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
