package com.jbk.DemoAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        		Employee e= context.getBean("getInstance",Employee.class);
        		System.out.println(e);
        
    }
}
