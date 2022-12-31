package com.apollo.springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SpringTest
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/context.xml");

        System.out.println("myFirstLevelRepository是否存在" + context.containsBean("myFirstLevelRepository"));


        System.out.println("mySecondLevelRepository是否存在" + context.containsBean("mySecondLevelRepository"));


        context.close();


    }
}
