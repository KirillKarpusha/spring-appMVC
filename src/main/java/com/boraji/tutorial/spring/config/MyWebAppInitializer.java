package com.boraji.tutorial.spring.config;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @author imssbora
 */

public class MyWebAppInitializer extends 
   AbstractAnnotationConfigDispatcherServletInitializer{

  /* @Override
   protected Class<?>[] getRootConfigClasses() {
      return new Class[]{RootConfig.class};
   }*/

   @Override
   protected Class<?>[] getServletConfigClasses() {
      return new Class[]{WebConfig.class};
   }
   @Override
   protected String[] getServletMappings() {
      return new String[]{"/"};
   }
   @Override
   protected Class<?>[] getRootConfigClasses() {
      return new Class[] { HelloWebSecurityConfiguration.class };
   }


}
