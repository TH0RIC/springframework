package com.course.springDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class initDestroyApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextInitDestroy.xml");


        // use bean
        Director Pepe= context.getBean("employee",Director.class);

        System.out.println(Pepe.getReport());

        // close context
        context.close();




    }
}
