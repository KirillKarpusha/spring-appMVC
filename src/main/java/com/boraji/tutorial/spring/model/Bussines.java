package com.boraji.tutorial.spring.model;

import org.springframework.context.annotation.Bean;


public interface Bussines {
     String name ="";
     void setName();
    default Integer GetRuntime(){return Runtime.getRuntime().availableProcessors();}
}
