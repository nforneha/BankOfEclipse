package com.bank.model;
import com.bank.entities.Customer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;


public class CustomerModel {
	
	SessionFactory sessionFactory ;
	 //getting customer details from oracle
	public Customer getCustomer(String pan) {
		try {
		Configuration configuration = new Configuration();
		sessionFactory=configuration.configure().buildSessionFactory();
			Session session;
				 if(sessionFactory.getCurrentSession()==null) {
					 session=sessionFactory.openSession();
				 }else session=sessionFactory.getCurrentSession();
				 if(!session.beginTransaction().isActive()) {
					session.beginTransaction();
				}
			// query to get customer details
			Query q=session.
					createQuery("from Customer cust where cust.panNumber=:pan");
			q.setString("pan",pan);
			System.out.println(q);
			Customer cst= (Customer) q.uniqueResult();
			return cst;
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
			return null;
		}
	}
	
	
}
