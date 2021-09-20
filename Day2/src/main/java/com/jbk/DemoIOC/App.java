package com.jbk.DemoIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
        
        Employee e1=context.getBean("emp",Employee.class);
        
        System.out.println(e1);
 Employee e2=context.getBean("emp",Employee.class);
        
        System.out.println(e2);
        
        
        
    }
}
