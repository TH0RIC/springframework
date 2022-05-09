package com.course.springDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class singletonPrototypeApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextSingletonPrototype.xml");


        Secretary Pepe= context.getBean("mySecretary",Secretary.class);
        Secretary Goku= context.getBean("mySecretary",Secretary.class);

        // Tienen la misma posicion en memoria  SINGLETON
        System.out.println(Pepe);
        System.out.println(Goku);

        if(Goku==Pepe){

            System.out.println("Apuntan al mismo objeto");
        }else {
            System.out.println("No apuntan al mismo objeto");
        }
    }
}
