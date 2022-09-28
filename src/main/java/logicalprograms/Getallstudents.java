package logicalprograms;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Getallstudents {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		//EntityTransaction et=em.getTransaction();
		Query q=em.createQuery("select s from Student s");
		List<Student> al=q.getResultList();
		for(Student s:al)
		{
			System.out.println("id:"+s.getRol());
			System.out.println("name:"+s.getName());
			System.out.println("percentage:"+s.getPercentage());
			System.out.println("---------------");
		}
	}

}
