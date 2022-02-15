package hu.Vadasz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class HunterApplication {
    public static void main(String[] args) {
        System.err.print("A program fut");
        SpringApplication.run(HunterApplication.class, args);
        System.err.println("A program vége");

    }
}
