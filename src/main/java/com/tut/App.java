package com.tut;

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
        Student student = new Student();
        student.setId(2);
        student.setName("Vikas");
        student.setEmail("vikaspoute@gmail.com");
        student.setAddress("Kharadi, Pune");

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }
}
