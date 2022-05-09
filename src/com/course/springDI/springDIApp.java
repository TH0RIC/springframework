package com.course.springDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springDIApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        //retrieve ask for bean from spring container
        Director Pepe= context.getBean("employee",Director.class);
        //Secretary Goku= context.getBean("mySecretary",Secretary.class);

        // use methods on the bean
        //System.out.println(Pepe.getReport());
        System.out.println(Pepe.getReport());
        System.out.println(Pepe.getEmail());
        System.out.println(Pepe.getCompanyName());


        // close the context
        context.close();
    }
}
