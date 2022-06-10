package org.example;


import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {

        //create object of sessionfactory
        Configuration confg = new Configuration();
        //configure is a function,by which i call buildsessionfactory
        confg.configure("hibernate.cfg.xml");
        //type of connection this type of factory by
        // which we find session by session we can save data into
        // database(a type of thread sava interface in one program only one session exist
        SessionFactory sf = confg.buildSessionFactory();
        //get seession by which we save data
        Session session = sf.openSession();
        //System.out.println(sf.isClosed());
        //we can use factory object to perform sql opertion.

        Transaction tx;
        Scanner sc=new Scanner(System.in);

            tx = session.beginTransaction();

            pojo st = new pojo();
            System.out.println("enter student name");
            st.setName(sc.next());
            System.out.println("enter student  ID");
            st.setId(sc.nextInt());
            System.out.println("enter student Salary");
            st.setSalary(sc.nextFloat());
            System.out.println("enter student company name");
            st.setCompany(sc.next());
            session.save(st);
            session.flush();
            tx.commit();
        System.out.println("data is added sucessfully");


    }
}
