package com.springmvc.curd.anno.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyContext extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		  return new Class[] {
				  MyHiberConfig.class
		        };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		 return new Class[] {
				 MyWebConfi.class
		        };
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		  return new String[] {
		            "/"
		        };
		    }
}
