package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Programe Started!!!!" );
        
        ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//        Student student = new  Student(1,"Ansh","Motihari");
//        int r = studentDao.insert(student);
//        System.out.println("inserted "+r);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true;
        while(go) {
        	System.out.println("PRESS 1 for adding student");
            System.out.println("PRESS 2 for display all student");
            System.out.println("PRESS 3 for getting details of single student");
            System.out.println("PRESS 4 for updating student");
            System.out.println("PRESS 5 for delete");
            System.out.println("PRESS 6 for exit");
            try {
            	
            	int input = Integer.parseInt(br.readLine());
            	switch (input) {
				case 1:
					//add student
					break;
				case 2:
					//display all student
					break;
				case 3:
					//get single student
					break;
				case 4:
					//updating student
					break;
				case 5:
					//delete student
					break;

				case 6:
					go=false;
					break;
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid INPUT Try another one");
				System.out.println(e.getMessage());
			}
        }
        
    }
}
