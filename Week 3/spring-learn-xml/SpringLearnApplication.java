package com.cognizant.springlearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("country.xml");
        Country c = (Country) ctx.getBean("country");
        System.out.println(c.getCode() + " : " + c.getName());
    }
}
