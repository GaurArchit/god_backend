package com.games.god_backend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.games.configuration.DBConfiguration;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
       
        ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class);
        System.out.println( "Hello World!" ); 
		
    }
}
