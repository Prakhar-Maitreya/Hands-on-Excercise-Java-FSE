package com.employee;

import com.employee.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            Employee e = new Employee(1, "David", "IT", 75000);
            session.beginTransaction();
            session.save(e);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
