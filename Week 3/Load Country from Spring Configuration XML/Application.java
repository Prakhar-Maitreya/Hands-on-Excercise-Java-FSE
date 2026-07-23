package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("countryContext.xml");
        Country c = (Country) ctx.getBean("country");
        System.out.println(c.getCode() + " : " + c.getName());
    }
}
