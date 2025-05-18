package com.hello.aa;
import org.springframework.context.annotation.*;
import com.hello.Student;
@Configuration
@ComponentScan("com.hello")
//@Import(AppConfig.class)
public class MyConfig {

    @Bean
    public com.hello.Student getStudent() {
        com.hello.Student student = new com.hello.Student();
//        System.out.println(student);
        return student;
    }
}
