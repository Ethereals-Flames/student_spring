package std.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import std.model.Student;

@Repository
public class StudentDaoImpl {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void saveStudent(Student student) {
		getSession().merge(student);
	}
	
	private Session getSession() {
		Session sess = getSessionFactory().getCurrentSession();
		if (sess == null) {
			sess = getSessionFactory().openSession();
		}
		return sess;
	}

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	
}
