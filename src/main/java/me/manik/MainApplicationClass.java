package me.manik;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication    // Make it a spring boot application
public class MainApplicationClass {
  public static void main (String[] args){
      SpringApplication.run(MainApplicationClass.class,args);
  }
}
