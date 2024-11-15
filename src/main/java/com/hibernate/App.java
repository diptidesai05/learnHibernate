package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Project Started");
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        System.out.println(factory);
        System.out.println(factory.isClosed());
        StudentDetails stud = new StudentDetails(123,"qwe","rty");
        Session session = factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(stud);
        tx.commit();
        session.close();
    }
}
