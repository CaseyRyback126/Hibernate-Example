package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    private final SessionFactory sessionFactory;

    public Main() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void insertCourse() {
        Course course = new Course();
        course.setTitle("Java");
        course.setDuration(24);

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(course);
        tx.commit();
        session.close();
    }

    public Course getCourse(Long id) {
        Session session = sessionFactory.openSession();
        Course course = session.get(Course.class, id);
        System.out.println(course);
        session.close();
        return course;
    }

    public void updateCourse(Course course) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(course);
        tx.commit();
        session.close();
    }

    public void deleteCourse(Long id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Course course = session.get(Course.class, id);
        session.delete(course);
        tx.commit();
        session.close();
    }
}