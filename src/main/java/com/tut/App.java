package com.tut;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        SessionFactory factory = HibernateUtil.getSessionFactory();
        // Student student = new Student();
        // student.setId(2);
        // student.setName("Vikas");
        // student.setEmail("vikaspoute@gmail.com");
        // student.setAddress("Kharadi, Pune");

        // Session session = factory.openSession();
        // Transaction transaction = session.beginTransaction();
        // session.save(student);
        // transaction.commit();
        // session.close();

        Employee emp = new Employee();
        emp.setAddress("India");
        emp.setEmail("vikas@gmail.com");
        emp.setEmpName("Vikas");
        emp.setJoiningDate(new Date());
        emp.setSalary(200000.00);
        emp.setStatus(true);
        emp.setToken("dffdfdfds577");
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(emp);
        transaction.commit();
        session.close();
    }
}
