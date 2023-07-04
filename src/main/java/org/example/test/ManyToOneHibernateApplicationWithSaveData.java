/**
 * Created By Krishna Shinde
 * Date : 03-07-2023
 * Time : 13:02
 * Project: ManyToOneHibernateApplicationWithSaveDBExample2
 **/

package org.example.test;

import org.example.entity.Students;
import org.example.entity.University;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ManyToOneHibernateApplicationWithSaveData {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Students students=new Students();
        students.setStudent_Name("Krishna Shinde");
        students.setRoll_No("21");

        Students students1=new Students();
        students1.setStudent_Name("Vijay Mohite");
        students1.setRoll_No("22");

        Students students2=new Students();
        students2.setStudent_Name("Ajay Dhole");
        students2.setRoll_No("24");

        University university=new University();
        university.setUniversity_Name("SPPU");
        university.setUniversity_Code("411028");

        students.setUniversity(university);
        students1.setUniversity(university);
        students2.setUniversity(university);

        session.persist(students);
        session.persist(students1);
        session.persist(students2);

        //fetching data by Get method provided by session interface

        Students students3=(Students) session.get(Students.class,1);
        University university1=(University) session.get(University.class,1);
        System.out.println("Student Name>>>>>"+students3.getStudent_Name()+"   " +
                "  Roll No>>>>"+students3.getRoll_No());
        System.out.println("University Name>>>>>"+university1.getUniversity_Name()
        +"  Code"+university1.getUniversity_Code());

       /* Students students3=(Students) session.load(Students.class,1);
        University university1=(University) session.load(University.class,1);
        System.out.println("Student Name>>>>>"+students3.getStudent_Name()+"   " +
                "  Roll No>>>>"+students3.getRoll_No());
        System.out.println("University Name>>>>>"+university1.getUniversity_Name()
                +"  Code"+university1.getUniversity_Code());*/

        transaction.commit();
        session.close();

        System.out.println("Data has been successfully saved and retrive");

    }
}


