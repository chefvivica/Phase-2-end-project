package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.User;
import com.utility.HibernateUtility;

public class UserDao {
	public static void saveUser(User u) {
		Session session = HibernateUtility.getSession();
		Transaction tx = session.beginTransaction();
		session.save(u);
		tx.commit();
	}
	
	public boolean validate(String username, String password) {
      
		Session session = HibernateUtility.getSession();
		Transaction tx = session.beginTransaction();
            // get an user object
		User user = new User();
        user = (User) session.createQuery("from User u where u.username = :username").setParameter("username", username)
                .uniqueResult();
            if (user != null && user.getPassword().equals(password)) {
                return true;
            }
            tx.commit();      
        return false;
    }
	
	

}
