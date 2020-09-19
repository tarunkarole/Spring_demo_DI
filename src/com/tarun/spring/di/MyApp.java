package com.tarun.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TenisCoach theCoach = context.getBean("myTenis",TenisCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getWorkout());
        System.out.println(theCoach.getDailyTenis());

        context.close();
    }
}
