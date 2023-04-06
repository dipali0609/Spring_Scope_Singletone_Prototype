package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        Student st=(Student)ctx.getBean("student");
        st.display();
        
        Student st1=(Student)ctx.getBean("student");
        System.out.println("st:"+st);
        System.out.println("st1:"+st1);
        
	}

}
