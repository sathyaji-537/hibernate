package com.xworkz.bird.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bird.DTO.BirdsDTO;

public class BirdsDAOImpl implements BirdsDAO {

	@Override
	public int save(BirdsDTO entity) {
		Configuration conn = new Configuration().configure().addAnnotatedClass(BirdsDTO.class);
		SessionFactory sf = conn.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		int pk =(int) session.save(entity);
		trans.commit();
		System.out.println(pk);
		session.close();
		sf.close();
		
		return pk;
	}

	@Override
	public BirdsDTO readById(int pk) {
		Configuration conn = new Configuration().configure().addAnnotatedClass(BirdsDTO.class);
		SessionFactory sf= conn.buildSessionFactory();
		Session session = sf.openSession();
		BirdsDTO dto = session.get(BirdsDTO.class, pk);
		session.close();
		sf.close();
		
		return dto;
	}

}
