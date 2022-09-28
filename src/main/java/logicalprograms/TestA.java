package logicalprograms;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestA {
	public static void main(String[] args) {
		Student student=new Student();
		student.setRol(1);
		student.setName("theja");
		student.setPercentage(45);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		System.out.println(entityManagerFactory);
		
		EntityManager em=entityManagerFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(student);
		et.commit();
	}

}
