package com.infotel.TpNoteMavenSpring.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpNoteMavenSpring.metier.Devlogiciel;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
      Devlogiciel d1= context.getBean("devl", Devlogiciel.class);
      System.out.println(d1);
    }
}
