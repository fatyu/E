package cc.notalk.e;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration
@EnableTransactionManagement
@ServletComponentScan
@ComponentScan
@EnableScheduling
@SpringBootApplication
public class EApplication {

    public static void main(String[] args) {
        SpringApplication.run(EApplication.class, args);
    }

}