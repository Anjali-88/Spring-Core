package com.spring;

import com.spring.collections.Dependent;
import com.spring.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ApplicationContext context =new ClassPathXmlApplicationContext("Employee.xml");
        Employee employee1= (Employee) context.getBean("employee1");
        Employee employee2= (Employee) context.getBean("employee2");
        Employee employee3= (Employee) context.getBean("employee3");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);


        ApplicationContext context1 = new ClassPathXmlApplicationContext("Emp.xml");
        Emp emp= (Emp) context1.getBean("emp1");
        System.out.println(emp.getEmployeeName());
        System.out.println(emp.getPhones());
        System.out.println(emp.getAddresses());
        System.out.println(emp.getCourses());
        System.out.println(emp.getProps());


        ApplicationContext context2 = new ClassPathXmlApplicationContext("Reference.xml");
        Dependent dependent= (Dependent) context2.getBean("dependentRef");
        System.out.println(dependent.getObject().getY());
        System.out.println(dependent);
    }



}
