package org.lindl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by lin on 2017/1/29.
 */
//@ServletComponentScan
@SpringBootApplication
public class Application {
    public static void main( String[] args )
    {
        SpringApplication.run(Application.class, args);
    }
}
