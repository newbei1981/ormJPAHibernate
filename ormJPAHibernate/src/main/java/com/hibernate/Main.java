package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {

        FamilyMember familyMember = new FamilyMember();
        familyMember.setId(3);
        familyMember.setFname("Svirskiy");
        familyMember.setSname("Timofiy");
        familyMember.setDateofbirth(Date.valueOf("2010-12-24"));

// Если у нас стандартно назван файл конфигурации hibernate.cfg то название FILE не указывается
// Для обобщенной JPA модели это файл persistence.xml c указанием полного пути, папка META-INF
        SessionFactory sessionFactory = new Configuration()
                .configure(/*FILE*/)
                .buildSessionFactory();


// session для обобщенной API(!НЕ конкретно ДЛЯ Hibernate называют entityManager пакет java.persistence)Session session = sessionFactory.openSession();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(familyMember);
        session.getTransaction().commit();
        session.close();

    }
}
