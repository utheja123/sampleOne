package logicalprograms;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveTeacher {
	public static void main(String[] args) {
		Teacher teacher=new Teacher();
		teacher.setName("venenla");
		teacher.setEmail("vennela@gmail.com");
		teacher.setSubject("biology");
		teacher.setPassword("234");
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		System.out.println(emf);
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(teacher);
		et.commit();
		
	}

}
