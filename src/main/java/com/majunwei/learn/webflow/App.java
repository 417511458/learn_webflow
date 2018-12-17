package com.majunwei.learn.webflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args ) throws Exception{

        SpringApplication application = new SpringApplication(App.class);
        application.run(args);

    }
}
