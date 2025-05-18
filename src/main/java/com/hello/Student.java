package com.hello;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class Student {
    public  int age=10;
    final int packagePrivateField = 0;
    public  int getAge() {
        return age;
    }

    public int getPackagePrivateField() {
        return packagePrivateField;
    }
}
