/**
 * Created By Krishna Shinde
 * Date : 03-07-2023
 * Time : 14:34
 * Project: ManyToOneHibernateApplicationWithSaveDBExample2
 **/

package org.example.test;

import jakarta.persistence.TypedQuery;
import org.example.entity.Students;
import org.example.entity.University;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ManyToOneHibernateApplicationWithFecthData {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry=new
                StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        TypedQuery typedQuery=session.createQuery("from Students students");
        List<Students> list=typedQuery.getResultList();
        Iterator<Students> iterator= list.listIterator();
        while (iterator.hasNext()){
            Students students= iterator.next();
            System.out.println("Students Name>>>>"+students.getStudent_Name()+" "+students.getRoll_No());
            University university=students.getUniversity();
            System.out.println("University Info>>>>>>>>>>"+university.getUniversity_Name()+" "+
                    university.getUniversity_Code());


        }
        session.close();
        System.out.println("Data has been successfully retrive");
    }
}


