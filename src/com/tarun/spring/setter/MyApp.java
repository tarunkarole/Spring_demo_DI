package com.tarun.spring.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_setter.xml");

        BaseBallImpl theCoach = context.getBean("myBaseball", BaseBallImpl.class);

        System.out.println(theCoach.getBaseBall());
        System.out.println(theCoach.getCricket());
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());

    }

}
